package com.rifsxd.processhook;

import android.annotation.SuppressLint;
import android.view.Display;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

@SuppressLint("DiscouragedPrivateApi")
public class processHook implements IXposedHookLoadPackage {

    private final String TAG = processHook.class.getSimpleName();

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        String packageName = lpparam.packageName;
        deviceInfo properties = deviceProperties.DEVICE_MAP.get(packageName);

        if (properties != null) {
            spoofDeviceProperties(properties);
            spoofRefreshRate(properties);
            XposedBridge.log("Spoofed " + packageName + " as " + properties.device);
        }

        hookIMEI(lpparam);
        hookDRM(lpparam);
        hookGAID(lpparam);
    }

    private void spoofDeviceProperties(deviceInfo properties) {
        setPropValue("MANUFACTURER", properties.manufacturer);
        setPropValue("BRAND", properties.brand);
        setPropValue("PRODUCT", properties.product);
        setPropValue("DEVICE", properties.device);
        setPropValue("MODEL", properties.model);
        setPropValue("HARDWARE", properties.hardware);
        setPropValue("BOARD", properties.board);
        setPropValue("BOOTLOADER", properties.bootloader);
        setPropValue("USER", properties.username);
        setPropValue("HOST", properties.hostname);
        setPropValue("FINGERPRINT", properties.fingerprint);
    }

    private void spoofRefreshRate(deviceInfo properties) {
        if (properties.refreshrate != null) {
            try {
                float spoofedRefreshRate = Float.parseFloat(properties.refreshrate);
                XposedBridge.hookAllMethods(Display.class, "getRefreshRate", new XC_MethodHook() {
                        @Override
                        protected void afterHookedMethod(MethodHookParam param) {
                            param.setResult(spoofedRefreshRate);
                            XposedBridge.log("Spoofed refresh rate to " + spoofedRefreshRate + " Hz");
                        }
                    });
            } catch (NumberFormatException e) {
                XposedBridge.log("Invalid refresh rate value: " + properties.refreshrate);
            }
        }
    }

    private void setPropValue(String key, Object value) {
        if (value != null) {
            try {
                Log.d(TAG, "Defining prop " + key + " to " + value);
                Field field = Build.class.getDeclaredField(key);
                field.setAccessible(true);
                field.set(null, value);
                field.setAccessible(false);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                XposedBridge.log("Failed to set prop: " + key + "\n" + Log.getStackTraceString(e));
            }
        }
    }

    private void hookIMEI(final XC_LoadPackage.LoadPackageParam lpparam) {
        try {
            Class<?> telephony = XposedHelpers.findClass("android.telephony.TelephonyManager", lpparam.classLoader);
            final String fakeImei = "867530912345678";

            XC_MethodHook hook = new XC_MethodHook() {
                protected void afterHookedMethod(MethodHookParam param) {
                    param.setResult(fakeImei);
                }
            };

            XposedBridge.hookAllMethods(telephony, "getDeviceId", hook);
            XposedBridge.hookAllMethods(telephony, "getImei", hook);

        } catch (Throwable t) {
            XposedBridge.log("IMEI Hook fail: " + t.getMessage());
        }
    }

    private void hookDRM(final XC_LoadPackage.LoadPackageParam lpparam) {
        try {
            Class<?> mediaDrm = XposedHelpers.findClass("android.media.MediaDrm", lpparam.classLoader);

            XposedBridge.hookAllMethods(mediaDrm, "getPropertyByteArray", new XC_MethodHook() {
                    protected void afterHookedMethod(MethodHookParam param) {
                        if ("deviceUniqueId".equals(param.args[0])) {
                            param.setResult("FAKEDRM12345678".getBytes());
                        }
                    }
                });
        } catch (Throwable t) {
            XposedBridge.log("DRM Hook fail: " + t.getMessage());
        }
    }

    private void hookGAID(final XC_LoadPackage.LoadPackageParam lpparam) {
        try {
            Class<?> infoClass = XposedHelpers.findClass("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info", lpparam.classLoader);

            XposedBridge.hookAllMethods(infoClass, "getId", new XC_MethodHook() {
                    protected void afterHookedMethod(MethodHookParam param) {
                        param.setResult("12345678-1234-1234-1234-1234567890ab");
                    }
                });
        } catch (Throwable t) {
            XposedBridge.log("GAID Hook fail: " + t.getMessage());
        }
    }
} 
