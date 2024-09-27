package com.rifsxd.processhook;

import java.util.HashMap;
import java.util.Map;

public class deviceProperties {

    public static final Map<String, deviceInfo> DEVICE_MAP;


    // Predefined Debug Profile
    public static final deviceInfo DEBUG_1 = new deviceInfo("DEBUG_MAUFACTURER", "DEBUG_BRAND", "DEBUG_PRODUCT", "DEBUG_DEVICE", "DEBUG_MODEL", "DEBUG_HARDWARE", "DEBUG_BOARD", "DEBUG_BOOTLOADER", "120.00", "DEBUG_USER", "DEBUG_HOST", "brand/product/model:15/VP1A:220924.014/R.202409241234:user/release-keys");

    // Props Structure [ manufacturer -> brand -> product -> device -> model -> hardware -> platform -> board -> bootloader -> refreshrate | null => disable props spoof ]

    //                                                                          manufacturer    brand           product             device          model               hardware        board       bootloader      refreshrate     user    host    fingerprint

    // Predefined Device Profiles
    public static final deviceInfo ROG_PHONE_8          =       new deviceInfo("asus",          "asus",         "WW_AI2401",        "AI2401",       "ASUS_AI2401",      "qcom",         null,       null,           "165",          null,   null,   null);
    public static final deviceInfo SAMSUNG_S24_ULTRA    =       new deviceInfo("samsung",       "samsung",      "e3qxeea",          "SM-S928B",     "SM-S928B",         "qcom",         null,       null,           "120",          null,   null,   null);
    public static final deviceInfo BLACKSHARK_5_PRO     =       new deviceInfo("blackshark",    "blackshark",   "KTUS-A0",          "KTUS-A0",      "Shark KTUS-A0",    "qcom",         null,       null,           "120",          null,   null,   null);
    public static final deviceInfo REALME_GT6_5G        =       new deviceInfo("realme",        "realme",       "RMX3800",          "RE5C4FL1",     "RMX3800",          "qcom",         null,       null,           "120",          null,   null,   null);
    public static final deviceInfo ONEPLUS_12           =       new deviceInfo("oneplus",       "oneplus",      "CPH2581",          "CPH2581",      "CPH2581",          "qcom",         null,       null,           "120",          null,   null,   null);
    public static final deviceInfo VIVO_IQOO_11_PRO     =       new deviceInfo("vivo",          "vivo",         "V2243A",           "V2243A",       "V2243A",           "qcom",         null,       null,           "120",          null,   null,   null);
    public static final deviceInfo POCO_F5              =       new deviceInfo("xiaomi",        "xiaomi",       "marble",           "23049PCD8G",   "23049PCD8G",       "qcom",         null,       null,           "120",          null,   null,   null);
    public static final deviceInfo MI_14_PRO            =       new deviceInfo("xiaomi",        "xiaomi",       "shennong",         "23116PN5BG",   "23116PN5BG",       "qcom",         null,       null,           "120",          null,   null,   null);
    
    // Use predefined device profiles
    static {    
        DEVICE_MAP = new HashMap<>();

        // Debug Device
        DEVICE_MAP.put("com.ytheekshana.deviceinfo",                DEBUG_1);
        DEVICE_MAP.put("ru.andr7e.deviceinfohw",                    SAMSUNG_S24_ULTRA);

        // Asus ROG Phone 8
        DEVICE_MAP.put("com.gameloft.android.ANMP.GloftA9HM",       ROG_PHONE_8);
        DEVICE_MAP.put("com.activision.callofudty.warzone",         ROG_PHONE_8);
        DEVICE_MAP.put("com.ea.game.nfs14_row",                     ROG_PHONE_8);
        DEVICE_MAP.put("net.wargaming.wot.blitz",                   ROG_PHONE_8);
        DEVICE_MAP.put("com.pearlabyss.blackdesertm.gl",            ROG_PHONE_8);
        DEVICE_MAP.put("com.pearlabyss.blackdesertm",               ROG_PHONE_8);
        DEVICE_MAP.put("com.madfingergames.legends",                ROG_PHONE_8);
        DEVICE_MAP.put("com.ea.gp.fifamobile",                      ROG_PHONE_8);

        // Samsung Galaxy S24 Ultra
        DEVICE_MAP.put("com.activision.callofduty.shooter",         SAMSUNG_S24_ULTRA);
        DEVICE_MAP.put("com.miraclegames.farlight84",               SAMSUNG_S24_ULTRA);
        DEVICE_MAP.put("vng.games.revelation.mobile",               SAMSUNG_S24_ULTRA);
        DEVICE_MAP.put("com.tencent.tmgp.pubgmhd",                  SAMSUNG_S24_ULTRA);
        DEVICE_MAP.put("com.miHoYo.GenshinImpact",                  SAMSUNG_S24_ULTRA);
        DEVICE_MAP.put("com.netease.lztgglobal",                    SAMSUNG_S24_ULTRA);

        // Black Shark 4
        DEVICE_MAP.put("com.proximabeta.mf.uamo",                   BLACKSHARK_5_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.kr.codm",                  BLACKSHARK_5_PRO);
        DEVICE_MAP.put("com.vng.codmvn",                            BLACKSHARK_5_PRO);
        DEVICE_MAP.put("com.vng.pubgmobile",                        BLACKSHARK_5_PRO);
        DEVICE_MAP.put("com.pubg.krmobile",                         BLACKSHARK_5_PRO);
        DEVICE_MAP.put("com.pubg.imobile",                          BLACKSHARK_5_PRO);
        DEVICE_MAP.put("com.rekoo.pubgm",                           BLACKSHARK_5_PRO);
        DEVICE_MAP.put("com.tencent.ig",                            BLACKSHARK_5_PRO);

        // Vivo iQOO 11 Pro
        DEVICE_MAP.put("com.tencent.tmgp.gnyx",                     VIVO_IQOO_11_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.cod",                      VIVO_IQOO_11_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.cf",                       VIVO_IQOO_11_PRO);
        DEVICE_MAP.put("com.tencent.KiHan",                         VIVO_IQOO_11_PRO);
        
        // Realme GT6 5G
        DEVICE_MAP.put("com.riotgames.league.teamfighttacticsvn",   REALME_GT6_5G);
        DEVICE_MAP.put("com.riotgames.league.teamfighttacticstw",   REALME_GT6_5G);
        DEVICE_MAP.put("com.riotgames.league.teamfighttactics",     REALME_GT6_5G);
        DEVICE_MAP.put("com.riotgames.league.wildriftvn",           REALME_GT6_5G);
        DEVICE_MAP.put("com.riotgames.league.wildrifttw",           REALME_GT6_5G);
        DEVICE_MAP.put("com.riotgames.league.wildrift",             REALME_GT6_5G);
        
        // OnePlus 12
        DEVICE_MAP.put("com.mojang.minecraftpe",                    ONEPLUS_12);
        DEVICE_MAP.put("com.YoStar.AetherGazer",                    ONEPLUS_12);
        DEVICE_MAP.put("com.garena.game.lmjx",                      ONEPLUS_12);
        DEVICE_MAP.put("com.ngame.allstar.eu",                      ONEPLUS_12);
        DEVICE_MAP.put("com.epicgames.fortnite",                    ONEPLUS_12);
        DEVICE_MAP.put("com.epicgames.portal",                      ONEPLUS_12);
        DEVICE_MAP.put("com.tencent.lolm",                          ONEPLUS_12);
        DEVICE_MAP.put("jp.konami.pesam",                           ONEPLUS_12);

        // Poco F5
        DEVICE_MAP.put("com.dts.freefiremax",                       POCO_F5);
        DEVICE_MAP.put("com.dts.freefire",                          POCO_F5);
        DEVICE_MAP.put("com.garena.game.codm",                      POCO_F5);
        DEVICE_MAP.put("com.garena.game.kgvn",                      POCO_F5);
        
        // Xiaomi 14 Pro
        DEVICE_MAP.put("com.levelinfinite.sgameGlobal",             MI_14_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.sgame",                    MI_14_PRO);
        DEVICE_MAP.put("com.ea.gp.apexlegendsmobilefps",            MI_14_PRO);
        DEVICE_MAP.put("com.levelinfinite.hotta.gp",                MI_14_PRO);
        DEVICE_MAP.put("com.supercell.clashofclans",                MI_14_PRO);
        DEVICE_MAP.put("com.mobilelegends.mi",                      MI_14_PRO);
        DEVICE_MAP.put("com.vng.mlbbvn",                            MI_14_PRO);

        
    }
}
