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

/**
 * processHook class implements IXposedHookLoadPackage to modify device properties
 * and refresh rate for specific applications.
 */
@SuppressLint("DiscouragedPrivateApi")
public class processHook implements IXposedHookLoadPackage {

    private final String TAG = processHook.class.getSimpleName();

    /**
     * This method is called when a package is loaded. It checks if the package
     * is one that we want to modify and applies the necessary spoofing.
     *
     * @param loadPackageParam The parameters for the loaded package.
     */
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String packageName = loadPackageParam.packageName;
        deviceInfo properties = deviceProperties.DEVICE_MAP.get(packageName);

        // Check if the package is in our device properties map
        if (properties != null) {
            // Spoof device properties and refresh rate
            spoofDeviceProperties(properties);
            spoofRefreshRate(properties);
            XposedBridge.log("Spoofed " + packageName + " as " + properties.device);
        }
    }

    /**
     * Spoofs device-related properties using reflection to set values in the Build class.
     *
     * @param properties The deviceInfo object containing spoof values.
     */
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

    /**
     * Spoofs the refresh rate of the device display.
     * Hooks into the getRefreshRate method to return a custom value.
     *
     * @param properties The deviceInfo object containing the desired refresh rate.
     */
    private void spoofRefreshRate(deviceInfo properties) {
        if (properties.refreshrate != null) {
            try {
                // Parse the refresh rate to a float
                float spoofedRefreshRate = Float.parseFloat(properties.refreshrate);
                // Hook the getRefreshRate method of Display class
                XposedBridge.hookAllMethods(Display.class, "getRefreshRate", new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) {
                        // Set the result to our spoofed refresh rate
                        param.setResult(spoofedRefreshRate);
                        XposedBridge.log("Spoofed refresh rate to " + spoofedRefreshRate + " Hz");
                    }
                });
            } catch (NumberFormatException e) {
                XposedBridge.log("Invalid refresh rate value: " + properties.refreshrate);
            }
        }
    }

    /**
     * Sets a device property value using reflection.
     * This method accesses the static fields of the Build class to modify their values.
     *
     * @param key   The property name to be set (e.g., MANUFACTURER, BRAND).
     * @param value The new value for the property.
     */
        


        
    private void setPropValue(String key, Object value) {
        if (value != null) {
            try {
                Log.d(TAG, "Defining prop " + key + " to " + value);
                // Access the field in the Build class
                Field field = Build.class.getDeclaredField(key);
                field.setAccessible(true); // Bypass access checks
                field.set(null, value); // Set the value
                field.setAccessible(false); // Revert access checks
            } catch (NoSuchFieldException | IllegalAccessException e) {
                XposedBridge.log("Failed to set prop: " + key + "\n" + Log.getStackTraceString(e));
            }
        }
    }
}
