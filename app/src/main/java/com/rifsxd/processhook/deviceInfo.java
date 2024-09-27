package com.rifsxd.processhook;

public class deviceInfo {

    String manufacturer;
    String brand;
    String product;
    String device;
    String model;
    String hardware;
    String board;
    String bootloader;
    String refreshrate;
    String username;
    String hostname;
    String fingerprint;
    //String template;

    public deviceInfo(String manufacturer, String brand, String product, String device, String model, String hardware, String board, String bootloader, String refreshrate, String username, String hostname, String fingerprint/*, String template*/) {
        
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.product = product;
        this.device = device;
        this.model = model;
        this.hardware = hardware;
        this.board = board;
        this.bootloader = bootloader;
        this.refreshrate = refreshrate;
        this.username = username;
        this.hostname = hostname;
        this.fingerprint = fingerprint;
        /*this.template = template;*/
    }
}
