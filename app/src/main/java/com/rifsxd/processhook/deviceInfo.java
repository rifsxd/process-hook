package com.rifsxd.processhook;

public class deviceInfo {
    String brand;
    String manufacturer;
    String device;
    String model;
    String hardware;
    String board;
    String bootloader;
    //String template;

    public deviceInfo(String brand, String manufacturer, String device, String model, String hardware, String board, String bootloader/*, String template*/) {
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.device = device;
        this.model = model;
        this.hardware = hardware;
        this.board = board;
        this.bootloader = bootloader;
        /*this.template = template;*/
    }
}
