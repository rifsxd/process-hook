package com.rifsxd.processhook;

import java.util.HashMap;
import java.util.Map;

public class deviceProperties {

    public static final Map<String, deviceInfo> DEVICE_MAP;


    // Predefined Debug Profile
    public static final deviceInfo DEBUG_1 = new deviceInfo("DEBUG_BRAND", "DEBUG_MAUFACTURER", "DEBUG_DEVICE", "DEBUG_MODEL", "DEBUG_HARDWARE", "DEBUG_BOARD", "DEBUG_BOOTLOADER");

    // Props Structure [ brand -> manufacturer -> device -> model -> hardware -> board -> bootloader | null => disable props spoof ]

    // Predefined Device Profiles
    public static final deviceInfo ROG_PHONE_6 = new deviceInfo("Asus", "asus", "AI2201", "ASUS_AI2201", null, null, null);
    public static final deviceInfo SAMSUNG_S9_PLUS = new deviceInfo("Samsung", "Samsung", "SM-G965F", null, null, null, null);
    public static final deviceInfo BLACKSHARK_2 = new deviceInfo("blackshark", "blackshark", "2SM-X706B", null, null, null, null);
    public static final deviceInfo IQOO_11_PRO = new deviceInfo("vivo", "vivo", "V2243A", null, null, null, null);
    public static final deviceInfo ONEPLUS_8_PRO = new deviceInfo("OnePlus", "OnePlus", "IN2020", null, null, null, null);
    public static final deviceInfo ONEPLUS_9_PRO = new deviceInfo("OnePlus", "OnePlus", "LE2123", null, null, null, null);
    public static final deviceInfo POCO_F5 = new deviceInfo("Xiaomi", "Xiaomi", "23049PCD8G", null, null, null, null);
    public static final deviceInfo SONY_XPERIA_5 = new deviceInfo("Sony", "Sony", "SO-52A", null, null, null, null);
    public static final deviceInfo MI_11T_PRO = new deviceInfo("Xiaomi", "Xiaomi", "2107113SI", null, null, null, null);
    public static final deviceInfo MI_13_PRO = new deviceInfo("Xiaomi", "Xiaomi", "2210132C", null, null, null, null);

    // Use predefined device profiles
    static {    
        DEVICE_MAP = new HashMap<>();

        // Debug Device
        DEVICE_MAP.put("com.ytheekshana.deviceinfo", DEBUG_1);

        // Asus ROG Phone 6
        DEVICE_MAP.put("com.gameloft.android.ANMP.GloftA9HM",       ROG_PHONE_6);
        DEVICE_MAP.put("com.activision.callofudty.warzone",         ROG_PHONE_6);
        DEVICE_MAP.put("com.pearlabyss.blackdesertm.gl",            ROG_PHONE_6);
        DEVICE_MAP.put("com.pearlabyss.blackdesertm",               ROG_PHONE_6);
        DEVICE_MAP.put("com.madfingergames.legends",                ROG_PHONE_6);
        DEVICE_MAP.put("com.ea.game.nfs14_row",                     ROG_PHONE_6);
        DEVICE_MAP.put("com.ea.gp.fifamobile",                      ROG_PHONE_6);
        DEVICE_MAP.put("net.wargaming.wot.blitz",                   ROG_PHONE_6);

        // Samsung Galaxy S9+
        DEVICE_MAP.put("com.activision.callofduty.shooter",         SAMSUNG_S9_PLUS);

        // Black Shark 4
        DEVICE_MAP.put("com.proximabeta.mf.uamo",                   BLACKSHARK_2);
        DEVICE_MAP.put("com.miraclegames.farlight84",               BLACKSHARK_2);

        // iQOO 11 Pro
        DEVICE_MAP.put("com.tencent.tmgp.gnyx",                     IQOO_11_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.cod",                      IQOO_11_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.cf",                       IQOO_11_PRO);
        DEVICE_MAP.put("com.tencent.KiHan",                         IQOO_11_PRO);
        
        
        
        // OnePlus 8 Pro
        DEVICE_MAP.put("com.riotgames.league.teamfighttacticsvn",   ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.riotgames.league.teamfighttacticstw",   ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.riotgames.league.teamfighttactics",     ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.riotgames.league.wildriftvn",           ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.riotgames.league.wildrifttw",           ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.riotgames.league.wildrift",             ONEPLUS_8_PRO);
        DEVICE_MAP.put("vng.games.revelation.mobile",               ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.pubgmhd",                  ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.miHoYo.GenshinImpact",                  ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.netease.lztgglobal",                    ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.mojang.minecraftpe",                    ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.YoStar.AetherGazer",                    ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.garena.game.lmjx",                      ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.ngame.allstar.eu",                      ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.vng.pubgmobile",                        ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.pubg.krmobile",                         ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.pubg.imobile",                          ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.rekoo.pubgm",                           ONEPLUS_8_PRO);
        DEVICE_MAP.put("com.tencent.ig",                            ONEPLUS_8_PRO);
        

        // OnePlus 9 Pro
        DEVICE_MAP.put("com.epicgames.fortnite",                    ONEPLUS_9_PRO);
        DEVICE_MAP.put("com.epicgames.portal",                      ONEPLUS_9_PRO);
        DEVICE_MAP.put("com.tencent.lolm",                          ONEPLUS_9_PRO);
        DEVICE_MAP.put("jp.konami.pesam",                           ONEPLUS_9_PRO);

        // Poco F5
        DEVICE_MAP.put("com.dts.freefiremax",                       POCO_F5);
        DEVICE_MAP.put("com.dts.freefire",                          POCO_F5);

        // Sony Xperia 5
        DEVICE_MAP.put("com.tencent.tmgp.kr.codm",                  SONY_XPERIA_5);
        DEVICE_MAP.put("com.garena.game.codm",                      SONY_XPERIA_5);
        DEVICE_MAP.put("com.garena.game.kgvn",                      SONY_XPERIA_5);
        DEVICE_MAP.put("com.vng.codmvn",                            SONY_XPERIA_5);

        // Xiaomi Mi 11T Pro
        DEVICE_MAP.put("com.ea.gp.apexlegendsmobilefps",            MI_11T_PRO);
        DEVICE_MAP.put("com.levelinfinite.hotta.gp",                MI_11T_PRO);
        DEVICE_MAP.put("com.supercell.clashofclans",                MI_11T_PRO);
        DEVICE_MAP.put("com.mobilelegends.mi",                      MI_11T_PRO);
        DEVICE_MAP.put("com.vng.mlbbvn",                            MI_11T_PRO);

        // Xiaomi 13 Pro
        DEVICE_MAP.put("com.levelinfinite.sgameGlobal",             MI_13_PRO);
        DEVICE_MAP.put("com.tencent.tmgp.sgame",                    MI_13_PRO);
    }
}
