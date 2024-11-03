# Process Hook

<p align="left">
  <img src="assets/process-hook.png" alt="Process Hook" />
</p>

## Unlock hidden features and options
Hook specific process/apps/games to spoof your device as different model/device to unlock hidden features and options. Check list of support - [Supported Lists](#supported-debug-apps) 


<div align="center">
	
[![GitHub license](https://img.shields.io/github/license/rifsxd/process-hook?logo=apache&label=License&style=flat)](https://github.com/rifsxd/process-hook/blob/master/LICENSE)
![GitHub Downloads (all assets, all releases)](https://img.shields.io/github/downloads/rifsxd/process-hook/total?logo=github&label=Downloads&style=flat)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/rifsxd/process-hook?style=flat&label=Code%20Size)
[![GitHub Debug CI Status](https://img.shields.io/github/actions/workflow/status/rifsxd/process-hook/ci.yml?logo=github&label=Debug%20CI&style=flat)](https://github.com/rifsxd/process-hook/actions/workflows/ci.yml)

</div>


## Features

- Device spoofing for enhanced gaming experiences.
- Display refreshrate spoofing to unlock higher framerate options. ( To test this spoof install any app from the [Debug Lists](#supported-debug-apps) and check display specifications )
- Compatibility with a wide range of popular gaming applications.
- Easy installation and no extra configuration.

## High End Devices

The following is the current list of devices that Process Hook will spoof your device into for supported games and apps. Click on the device names to view the corresponding profile in the code:

- [ROG_PHONE_8](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L37)
- [SAMSUNG_S24_ULTRA](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L53)
- [BLACKSHARK_5_PRO](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L69)
- [REALME_GT6_5G](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L85)
- [ONEPLUS_12](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L101)
- [VIVO_IQOO_11_PRO](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L117)
- [POCO_F6_PRO](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L133)
- [MI_14_PRO](app/src/main/java/com/rifsxd/processhook/deviceProperties.java#L149)

## Table of Contents

- [Getting Started](#getting-started)
- [Usage](#usage)
- [License](#license)
- [Contributing](#contributing)

## Getting Started

To get started with Process Hook, follow these steps:

1. Ensure that your Android device is rooted.

2. Install the Xposed/Lsposed Framework on your device.
   
3. Download the Process Hook module from the [releases section](https://github.com/rifsxd/process-hook/releases) of this repository.

4. Install the downloaded apk :
   - Open Xposed/Lsposed Manager.
   - Go to the "Modules" section.
   - Search "Process Hook" and enable the module.
   - The supported process/apps/games are auto added to the scope.
   - Force Stop the added game manually to take effect.

## Usage

Once you've installed and activated the Process Hook module, it will automatically spoof your device information for supported process/apps/games. There's no additional configuration required. Simply force stop and open the process/apps/games you want to run and enjoy the benefits of device spoofing.

You can untick the game you don't want to spoof for the module scope. Force stop and relaunch is required.

**Note:** Keep in mind that device spoofing may violate the terms of service for some games or apps.

Report any suggestions/issues with games [here](https://github.com/rifsxd/process-hook/issues)

## Supported Debug Apps

<details>
  <summary>Click to expand the list of supported apps</summary>

  - [Device Info](https://play.google.com/store/apps/details?id=com.ytheekshana.deviceinfo&hl=en)
  - [Device Info HW](https://play.google.com/store/apps/details?id=ru.andr7e.deviceinfohw&hl=en)
  - [Aida64](https://play.google.com/store/apps/details?id=com.finalwire.aida64&hl=en)

</details>

## Supported Games

<details>
  <summary>Click to expand the list of supported games</summary>

  - [Apex Legends Mobile](https://play.google.com/store/apps/details?id=com.ea.gp.apexlegendsmobilefps&hl=en&gl=US)
  - [Asphalt 9: Legends](https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftA9HM&hl=en&gl=US)
  - [Battlegrounds Mobile India](https://play.google.com/store/apps/details?id=com.pubg.imobile&hl=en&gl=US)
  - [Black Desert Mobile](https://play.google.com/store/apps/details?id=com.pearlabyss.blackdesertm.gl&hl=en&gl=US)
  - [Call Of Duty: Mobile VN](https://play.google.com/store/apps/details?id=com.vng.codmvn&hl=en&gl=US)
  - [Call of Duty: Mobile](https://play.google.com/store/apps/details?id=com.activision.callofduty.shooter&hl=en&gl=US)
  - [Call of Duty®: Mobile - Garena](https://play.google.com/store/apps/details?id=com.garena.game.codm&hl=en&gl=US)
  - [Clash of Clans](https://play.google.com/store/apps/details?id=com.supercell.clashofclans&hl=en&gl=US)
  - [Cyber Hunter](https://play.google.com/store/apps/details?id=com.netease.lztgglobal&hl=en&gl=US)
  - [Dead by Daylight: Mobile](https://play.google.com/store/apps/details?id=com.netease.dbdena&hl=en)
  - [EA SPORTS FC™ Mobile Soccer](https://play.google.com/store/apps/details?id=com.ea.gp.fifamobile&hl=en&gl=US)
  - [Farlight 84](https://play.google.com/store/apps/details?id=com.miraclegames.farlight84&hl=en)
  - [Fortnite Portal](https://play.google.com/store/apps/details?id=com.epicgames.portal&hl=en&gl=US)
  - [Fortnite](https://play.google.com/store/apps/details?id=com.epicgames.fortnite&hl=en&gl=US)
  - [Free Fire MAX](https://play.google.com/store/apps/details?id=com.dts.freefiremax&hl=en&gl=US)
  - [Free Fire](https://play.google.com/store/apps/details?id=com.dts.freefireth&hl=en&gl=US)
  - [Genshin Impact](https://play.google.com/store/apps/details?id=com.miHoYo.GenshinImpact)
  - [Honor of Kings](https://play.google.com/store/apps/details?id=com.levelinfinite.sgameGlobal&hl=en&gl=US)
  - [Honor of Kings](https://play.google.com/store/apps/details?id=com.tencent.tmgp.sgame&hl=en&gl=US)
  - [LMHT: Tốc Chiến](https://play.google.com/store/apps/details?id=com.riotgames.league.wildriftvn&hl=en&gl=US)
  - [League of Legends](https://play.google.com/store/apps/details?id=com.riotgames.league.wildrift&hl=en&gl=US)
  - [Mobile Legends: Bang Bang VNG](https://play.google.com/store/apps/details?id=com.vng.mlbbvn&hl=en&gl=US)
  - [Mobile Legends: Mi](https://global.app.mi.com/details?lo=ID&la=en&id=com.mobilelegends.mi&hl=en&gl=US)
  - [Mobile Legends](https://play.google.com/store/apps/details?id=com.mobile.legends&hl=en&gl=US)
  - [Need for Speed: No Limits](https://play.google.com/store/apps/details?id=com.ea.game.nfs14_row&hl=rn&gl=US)
  - [PUBG MOBILE：絕地求生M](https://play.google.com/store/apps/details?id=com.rekoo.pubgm&hl=en&gl=US)
  - [PUBG Mobile Beta](https://play.google.com/store/apps/details?id=com.tencent.ig&hl=en&gl=US)
  - [PUBG Mobile VN](https://play.google.com/store/apps/details?id=com.vng.pubgmobile&hl=en&gl=US)
  - [PUBG Mobile](https://play.google.com/store/apps/details?id=com.pubg.krmobile&hl=en&gl=US)
  - [PUBG Mobile: Lite](https://play.google.com/store/apps/details?id=com.tencent.iglite&hl=en)
  - [PUBG: Exhilarating Battlefield](https://play.google.com/store/apps/details?id=com.tencent.tmgp.pubgmhd&hl=en&gl=US)
  - [Shadowgun Legends: Online FPS](https://play.google.com/store/apps/details?id=com.madfingergames.legends&hl=en&gl=US)
  - [Tower of Fantasy](https://play.google.com/store/apps/details?id=com.levelinfinite.hotta.gp&hl=en&gl=US)
  - [World of Tanks: Blitz](https://play.google.com/store/apps/details?id=net.wargaming.wot.blitz&hl=en&gl=US)
  - [《英雄聯盟：激鬥峽谷》](https://play.google.com/store/apps/details?id=com.riotgames.league.wildrifttw&hl=en&gl=US)
  - [검은사막 모바일](https://play.google.com/store/apps/details?id=com.pearlabyss.blackdesertm&hl=en&gl=US)
  - [콜 오브 듀티: 모바일](https://play.google.com/store/apps/details?id=com.tencent.tmgp.kr.codm&hl=en&gl=US)

</details>

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
