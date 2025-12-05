package com.rifsxd.processhook;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code deviceProperties} class contains predefined device profiles
 * and a mapping of specific applications to those profiles. These profiles
 * simulate different device properties for use in testing or device-specific
 * optimizations in apps. 
 */
public final class deviceProperties {

    // Map that holds associations between app package names and deviceInfo objects
    public static final Map<String, deviceInfo> DEVICE_MAP = new HashMap<>();

    // Predefined Debug Profile
    // public static final deviceInfo DEBUG_1 = new deviceInfo(
        
    //     "DEBUG_MAUFACTURER",     // Manufacturer for the debug profile
    //     "DEBUG_BRAND",           // Brand for the debug profile
    //     "DEBUG_PRODUCT",         // Product identifier
    //     "DEBUG_DEVICE",          // Device name
    //     "DEBUG_MODEL",           // Model number
    //     "DEBUG_HARDWARE",        // Hardware identifier
    //     "DEBUG_BOARD",           // Board identifier
    //     "DEBUG_BOOTLOADER",      // Bootloader version
    //     "120.00",                // Refresh rate (Hz)
    //     "DEBUG_USER",            // Username property
    //     "DEBUG_HOST",            // Hostname property
    //     "brand/product/model:15/VP1A:220924.014/R.202409241234:user/release-keys" // Fingerprint identifier
    // );

    // Predefined Device Profiles

    // ROG Phone 8 Profile
    public static final deviceInfo ROG_PHONE_8 = new deviceInfo(
        "asus",             // Manufacturer
        "asus",             // Brand
        "WW_AI2401",        // Product
        "AI2401",           // Device
        "ASUS_AI2401",      // Model
        "qcom",             // Hardware
        null,                // Board (optional, null if not available)
        null,                // Bootloader (optional)
        "165",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "asus/WW_AI2401/AI2401:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Samsung Galaxy S24 Ultra Profile
    public static final deviceInfo SAMSUNG_S24_ULTRA = new deviceInfo(
        "samsung",          // Manufacturer
        "samsung",          // Brand
        "e3qxeea",          // Product
        "SM-S928B",         // Device 
        "SM-S928B",         // Model 
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "samsung/e3qxeea/SM-S928B:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Black Shark 5 Pro Profile
    public static final deviceInfo BLACKSHARK_5_PRO = new deviceInfo(
        "blackshark",       // Manufacturer
        "blackshark",       // Brand
        "KTUS-A0",          // Product
        "KTUS-A0",          // Device
        "Shark KTUS-A0",    // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "blackshark/KTUS-A0/KTUS-A0:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Realme GT6 5G Profile
    public static final deviceInfo REALME_GT6_5G = new deviceInfo(
        "realme",           // Manufacturer
        "realme",           // Brand
        "RMX3800",          // Product
        "RE5C4FL1",         // Device
        "RMX3800",          // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "realme/RMX3800/RE5C4FL1:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // OnePlus 12 Profile
    public static final deviceInfo ONEPLUS_12 = new deviceInfo(
        "oneplus",          // Manufacturer
        "oneplus",          // Brand
        "CPH2581",          // Product
        "CPH2581",          // Device
        "CPH2581",          // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "oneplus/CPH2581/CPH2581:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Vivo iQOO 11 Pro Profile
    public static final deviceInfo VIVO_IQOO_11_PRO = new deviceInfo(
        "vivo",             // Manufacturer
        "vivo",             // Brand
        "V2243A",           // Product
        "V2243A",           // Device
        "V2243A",           // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "vivo/V2243A/V2243A:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Poco F6 Pro Profile
    public static final deviceInfo POCO_F6_PRO = new deviceInfo(
        "xiaomi",           // Manufacturer
        "xiaomi",           // Brand
        "vermeer",          // Product
        "23113RKC6G",       // Device
        "23049PCD8G",       // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "xiaomi/vermeer/23113RKC6G:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Xiaomi 14 Pro Profile
    public static final deviceInfo MI_14_PRO = new deviceInfo(
        "xiaomi",           // Manufacturer
        "xiaomi",           // Brand
        "shennong",         // Product
        "23116PN5BG",       // Device
        "23116PN5BG",       // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "xiaomi/shennong/23116PN5BG:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Google Pixel 8 Pro Profile
    public static final deviceInfo PIXEL_8_PRO = new deviceInfo(
        "google",           // Manufacturer
        "google",           // Brand
        "cheetah",          // Product
        "cheetah",          // Device
        "Pixel 8 Pro",      // Model
        "gs201",            // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "google/cheetah/cheetah:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Sony Xperia 1 VI Profile
    public static final deviceInfo SONY_XPERIA_1_VI = new deviceInfo(
        "sony",             // Manufacturer
        "sony",             // Brand
        "XQ-AT52",          // Product
        "XQ-AT52",          // Device
        "Xperia 1 VI",      // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "sony/XQ-AT52/XQ-AT52:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Additional Device Profiles

    // Huawei Mate 60 Pro Profile
    public static final deviceInfo HUAWEI_MATE_60_PRO = new deviceInfo(
        "huawei",           // Manufacturer
        "huawei",           // Brand
        "ALP-AL00",         // Product
        "ALP-AL00",         // Device
        "Mate 60 Pro",      // Model
        "kirin",            // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "huawei/ALP-AL00/ALP-AL00:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Oppo Find X6 Pro Profile
    public static final deviceInfo OPPO_FIND_X6_PRO = new deviceInfo(
        "oppo",             // Manufacturer
        "oppo",             // Brand
        "PFEM10",           // Product
        "PFEM10",           // Device
        "Find X6 Pro",      // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "oppo/PFEM10/PFEM10:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Motorola Edge 40 Pro Profile
    public static final deviceInfo MOTOROLA_EDGE_40_PRO = new deviceInfo(
        "motorola",         // Manufacturer
        "motorola",         // Brand
        "XT2301-4",         // Product
        "XT2301-4",         // Device
        "Edge 40 Pro",      // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "144",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "motorola/XT2301-4/XT2301-4:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Asus Zenfone 10 Profile
    public static final deviceInfo ASUS_ZENFONE_10 = new deviceInfo(
        "asus",             // Manufacturer
        "asus",             // Brand
        "AI2302",           // Product
        "AI2302",           // Device
        "Zenfone 10",       // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "144",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "asus/AI2302/AI2302:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Nokia XR21 Profile
    public static final deviceInfo NOKIA_XR21 = new deviceInfo(
        "nokia",            // Manufacturer
        "nokia",            // Brand
        "TA-1412",          // Product
        "TA-1412",          // Device
        "XR21",             // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "nokia/TA-1412/TA-1412:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Lenovo Legion Phone Duel 2 Profile
    public static final deviceInfo LENOVO_LEGION_DUEL_2 = new deviceInfo(
        "lenovo",           // Manufacturer
        "lenovo",           // Brand
        "L70081",           // Product
        "L70081",           // Device
        "Legion Phone Duel 2", // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "144",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "lenovo/L70081/L70081:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Xiaomi Redmi Note 13 Pro+ Profile
    public static final deviceInfo REDMI_NOTE_13_PRO_PLUS = new deviceInfo(
        "xiaomi",           // Manufacturer
        "xiaomi",           // Brand
        "note13proplus",    // Product
        "note13proplus",    // Device
        "Redmi Note 13 Pro+", // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "xiaomi/note13proplus/note13proplus:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Vivo X100 Pro+ Profile
    public static final deviceInfo VIVO_X100_PRO_PLUS = new deviceInfo(
        "vivo",             // Manufacturer
        "vivo",             // Brand
        "X100ProPlus",      // Product
        "X100ProPlus",      // Device
        "X100 Pro+",        // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "vivo/X100ProPlus/X100ProPlus:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Honor Magic 6 Profile
    public static final deviceInfo HONOR_MAGIC_6 = new deviceInfo(
        "honor",            // Manufacturer
        "honor",            // Brand
        "Magic6",           // Product
        "Magic6",           // Device
        "Magic 6",          // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "honor/Magic6/Magic6:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // ZTE Nubia RedMagic 8 Pro Profile
    public static final deviceInfo ZTE_RED_MAGIC_8_PRO = new deviceInfo(
        "zte",              // Manufacturer
        "zte",              // Brand
        "NX729J",           // Product
        "NX729J",           // Device
        "RedMagic 8 Pro",   // Model
        "qcom",             // Hardware
        null,                // Board (optional)
        null,                // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,                // Username (optional)
        null,                // Hostname (optional)
        "zte/NX729J/NX729J:13/TQ3A.230705.001/230705:user/release-keys" // Fingerprint
    );

    // Static block to populate DEVICE_MAP with device profiles mapped to specific apps
    static {

        // Debug device mapping
        // DEVICE_MAP.put("ru.andr7e.deviceinfohw", DEBUG_1);

        // Populate device map for cashApp with random device spoofing
        String[] cashApp = {
            "com.squareup.cash",
            "ru.andr7e.deviceinfohw"
        };
        addToDeviceMapWithRandomDevice(cashApp);
    }

    /**
     * Adds an array of app package names to the DEVICE_MAP associated with a random device profile.
     *
     * @param apps An array of application package names
     */
    private static void addToDeviceMapWithRandomDevice(String[] apps) {
        deviceInfo[] devices = {
            ROG_PHONE_8, 
            SAMSUNG_S24_ULTRA, 
            BLACKSHARK_5_PRO, 
            REALME_GT6_5G, 
            ONEPLUS_12, 
            VIVO_IQOO_11_PRO, 
            POCO_F6_PRO, 
            MI_14_PRO, 
            PIXEL_8_PRO, 
            SONY_XPERIA_1_VI,
            HUAWEI_MATE_60_PRO, 
            OPPO_FIND_X6_PRO, 
            MOTOROLA_EDGE_40_PRO, 
            ASUS_ZENFONE_10, 
            NOKIA_XR21, 
            LENOVO_LEGION_DUEL_2, 
            REDMI_NOTE_13_PRO_PLUS, 
            VIVO_X100_PRO_PLUS, 
            HONOR_MAGIC_6, 
            ZTE_RED_MAGIC_8_PRO
        };

        for (String app : apps) {
            int randomIndex = (int) (Math.random() * devices.length);
            DEVICE_MAP.put(app, devices[randomIndex]);
        }
    }
}
