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
    public static final deviceInfo DEBUG_1 = new deviceInfo(
        
        "DEBUG_MAUFACTURER",     // Manufacturer for the debug profile
        "DEBUG_BRAND",           // Brand for the debug profile
        "DEBUG_PRODUCT",         // Product identifier
        "DEBUG_DEVICE",          // Device name
        "DEBUG_MODEL",           // Model number
        "DEBUG_HARDWARE",        // Hardware identifier
        "DEBUG_BOARD",           // Board identifier
        "DEBUG_BOOTLOADER",      // Bootloader version
        "120.00",                // Refresh rate (Hz)
        "DEBUG_USER",            // Username property
        "DEBUG_HOST",            // Hostname property
        "brand/product/model:15/VP1A:220924.014/R.202409241234:user/release-keys" // Fingerprint identifier
    );

    // Predefined Device Profiles

    // ROG Phone 8 Profile
    public static final deviceInfo ROG_PHONE_8 = new deviceInfo(
        "asus",             // Manufacturer
        "asus",             // Brand
        "WW_AI2401",        // Product
        "AI2401",           // Device
        "ASUS_AI2401",      // Model
        "qcom",             // Hardware
        null,               // Board (optional, null if not available)
        null,               // Bootloader (optional)
        "165",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // Samsung Galaxy S24 Ultra Profile
    public static final deviceInfo SAMSUNG_S24_ULTRA = new deviceInfo(
        "samsung",          // Manufacturer
        "samsung",          // Brand
        "e3qxeea",          // Product
        "SM-S928B",         // Device 
        "SM-S928B",         // Model 
        "qcom",             // Hardware
        null,               // Board (optional)
        null,               // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // Black Shark 5 Pro Profile
    public static final deviceInfo BLACKSHARK_5_PRO = new deviceInfo(
        "blackshark",       // Manufacturer
        "blackshark",       // Brand
        "KTUS-A0",          // Product
        "KTUS-A0",          // Device
        "Shark KTUS-A0",    // Model
        "qcom",             // Hardware
        null,               // Board (optional)
        null,               // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // Realme GT6 5G Profile
    public static final deviceInfo REALME_GT6_5G = new deviceInfo(
        "realme",           // Manufacturer
        "realme",           // Brand
        "RMX3800",          // Product
        "RE5C4FL1",         // Device
        "RMX3800",          // Model
        "qcom",             // Hardware
        null,               // Board (optional)
        null,               // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // OnePlus 12 Profile
    public static final deviceInfo ONEPLUS_12 = new deviceInfo(
        "oneplus",          // Manufacturer
        "oneplus",          // Brand
        "CPH2581",          // Product
        "CPH2581",          // Device
        "CPH2581",          // Model
        "qcom",             // Hardware
        null,               // Board (optional)
        null,               // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // Vivo iQOO 11 Pro Profile
    public static final deviceInfo VIVO_IQOO_11_PRO = new deviceInfo(
        "vivo",             // Manufacturer
        "vivo",             // Brand
        "V2243A",           // Product
        "V2243A",           // Device
        "V2243A",           // Model
        "qcom",             // Hardware
        null,               // Board (optional)
        null,               // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // Poco F6 Pro Profile
    public static final deviceInfo POCO_F6_PRO = new deviceInfo(
        "xiaomi",           // Manufacturer
        "xiaomi",           // Brand
        "vermeer",          // Product
        "23113RKC6G",       // Device
        "23049PCD8G",       // Model
        "qcom",             // Hardware
        null,               // Board (optional)
        null,               // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // Xiaomi 14 Pro Profile
    public static final deviceInfo MI_14_PRO = new deviceInfo(
        "xiaomi",           // Manufacturer
        "xiaomi",           // Brand
        "shennong",         // Product
        "23116PN5BG",       // Device
        "23116PN5BG",       // Model
        "qcom",             // Hardware
        null,               // Board (optional)
        null,               // Bootloader (optional)
        "120",              // Refresh rate (Hz)
        null,               // Username (optional)
        null,               // Hostname (optional)
        null                // Fingerprint (optional)
    );

    // Static block to populate DEVICE_MAP with device profiles mapped to specific apps
    static {

        // Debug device mapping
        DEVICE_MAP.put("com.ytheekshana.deviceInfo", DEBUG_1);
        DEVICE_MAP.put("ru.andr7e.deviceInfohw", ROG_PHONE_8);
        DEVICE_MAP.put("com.finalwire.aida64", SAMSUNG_S24_ULTRA);

        // Populate device map for ROG Phone 8 apps
        String[] rogPhoneApps = {
            "com.gameloft.android.ANMP.GloftA9HM",
            "com.activision.callofduty.shooter",
            "com.activision.callofudty.warzone",
            "com.ea.game.nfs14_row",
            "net.wargaming.wot.blitz",
            "com.pearlabyss.blackdesertm.gl",
            "com.pearlabyss.blackdesertm",
            "com.madfingergames.legends"
        };
        addToDeviceMap(rogPhoneApps, ROG_PHONE_8);

        // Populate device map for Samsung Galaxy S24 Ultra apps
        String[] samsungApps = {
            "com.ea.gp.fifamobile",
            "com.miraclegames.farlight84",
            "vng.games.revelation.mobile",
            "com.tencent.tmgp.pubgmhd",
            "com.miHoYo.GenshinImpact",
            "com.netease.dbdena",
            "com.netease.lztgglobal"
        };
        addToDeviceMap(samsungApps, SAMSUNG_S24_ULTRA);

        // Populate device map for Black Shark 5 Pro apps
        String[] blackSharkApps = {
            "com.proximabeta.mf.uamo",
            "com.tencent.tmgp.kr.codm",
            "com.vng.codmvn",
            "com.vng.pubgmobile",
            "com.pubg.krmobile",
            "com.pubg.imobile",
            "com.rekoo.pubgm",
            "com.tencent.ig"
        };
        addToDeviceMap(blackSharkApps, BLACKSHARK_5_PRO);

        // Populate device map for Vivo iQOO 11 Pro apps
        String[] vivoApps = {
            "com.tencent.tmgp.gnyx",
            "com.tencent.tmgp.cod",
            "com.tencent.tmgp.cf",
            "com.tencent.KiHan",
            "com.tencent.iglite"
        };
        addToDeviceMap(vivoApps, VIVO_IQOO_11_PRO);

        // Populate device map for Realme GT6 5G apps
        String[] realmeApps = {
            "com.riotgames.league.teamfighttacticsvn",
            "com.riotgames.league.teamfighttacticstw",
            "com.riotgames.league.teamfighttactics",
            "com.garena.game.lmjx",
            "com.ngame.allstar.eu",
            "com.epicgames.fortnite",
            "com.epicgames.portal"
        };
        addToDeviceMap(realmeApps, REALME_GT6_5G);

        // Populate device map for OnePlus 12 apps
        String[] onePlusApps = {
            "com.mojang.minecraftpe",
            "com.YoStar.AetherGazer",
            "com.riotgames.league.wildriftvn",
            "com.riotgames.league.wildrifttw",
            "com.riotgames.league.wildrift",
            "com.tencent.lolm",
            "jp.konami.pesam"
        };
        addToDeviceMap(onePlusApps, ONEPLUS_12);

        // Populate device map for Poco F6 Pro apps
        String[] pocoApps = {
            "com.dts.freefiremax",
            "com.dts.freefire",
            "com.garena.game.codm",
            "com.garena.game.kgvn"
        };
        addToDeviceMap(pocoApps, POCO_F6_PRO);

        // Populate device map for Xiaomi 14 Pro apps
        String[] mi14Apps = {
            "com.levelinfinite.sgameGlobal",
            "com.tencent.tmgp.sgame",
            "com.ea.gp.apexlegendsmobilefps",
            "com.levelinfinite.hotta.gp",
            "com.supercell.clashofclans",
            "com.mobilelegends.mi",
            "com.vng.mlbbvn"
        };
        addToDeviceMap(mi14Apps, MI_14_PRO);
    }

    /**
     * Adds an array of app package names to the DEVICE_MAP associated with a specific device profile.
     * 
     * @param apps       An array of application package names
     * @param deviceInfo The {@code deviceInfo} object containing the device properties
     */
    private static void addToDeviceMap(String[] apps, deviceInfo deviceInfo) {

        for (String app : apps) {
            DEVICE_MAP.put(app, deviceInfo);
        }
    }
}
