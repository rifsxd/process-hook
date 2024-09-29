package com.rifsxd.processhook;

import android.annotation.SuppressLint;
import android.view.WindowManager;
import android.content.Context;
import android.view.Display;
import android.os.Build;
import android.util.Log;

import java.lang.reflect.Field;

import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;


@SuppressLint("DiscouragedPrivateApi")
public class processHook implements IXposedHookLoadPackage {

    private static final String TAG = processHook.class.getSimpleName();

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {

        String packageName = loadPackageParam.packageName;
        deviceInfo properties = deviceProperties.DEVICE_MAP.get(packageName);

        if (properties != null) {
            spoofDeviceProperties(properties);
            spoofRefreshRate(properties);
            XposedBridge.log("Spoofed " + packageName + " as " + properties.device);
        }
    }

    private void spoofDeviceProperties(deviceInfo properties) {

        if (properties.manufacturer != null) {
            setPropValue("MANUFACTURER", properties.manufacturer);
        }

        if (properties.brand != null) {
            setPropValue("BRAND", properties.brand);
        }

        if (properties.product != null) {
            setPropValue("PRODUCT", properties.product);
        }

        if (properties.device != null) {
            setPropValue("DEVICE", properties.device);
        }

        if (properties.model != null) {
            setPropValue("MODEL", properties.model);
        }

        if (properties.hardware != null) {
            setPropValue("HARDWARE", properties.hardware);
        }

        if (properties.board != null) {
            setPropValue("BOARD", properties.board);
        }

        if (properties.bootloader != null) {
            setPropValue("BOOTLOADER", properties.bootloader);
        }

        if (properties.username != null) {
            setPropValue("USER", properties.username);
        }

        if (properties.hostname != null) {
            setPropValue("HOST", properties.hostname);
        }

        if (properties.fingerprint != null) {
            setPropValue("FINGERPRINT", properties.fingerprint);
        }
    }

    private void spoofRefreshRate(deviceInfo properties) {

        if (properties.refreshrate != null) {
            try {
                float spoofedRefreshRate = Float.parseFloat(properties.refreshrate);
                XposedBridge.hookAllMethods(Display.class, "getRefreshRate", new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        param.setResult(spoofedRefreshRate);
                        XposedBridge.log("Spoofed refresh rate to " + spoofedRefreshRate + " Hz");
                    }
                });
            } catch (NumberFormatException e) {
                XposedBridge.log("Invalid refresh rate value: " + properties.refreshrate);
            }
        }
    }

    private static void setPropValue(String key, Object value) {

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
