package com.rifsxd.processhook;

/**
 * The {@code deviceInfo} class stores device-specific information
 * such as manufacturer, brand, and model, which can be used to simulate
 * or override device properties in various applications.
 */
public final class deviceInfo {

    // Fields representing different device properties
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
    // String template;  // Optional field if needed in the future

    /**
     * Constructs a new {@code deviceInfo} object with the specified properties.
     *
     * @param manufacturer   Manufacturer of the device (e.g., "asus").
     * @param brand          Brand of the device (e.g., "samsung").
     * @param product        Product identifier (e.g., "WW_AI2401").
     * @param device         Device name (e.g., "AI2401").
     * @param model          Model identifier (e.g., "ASUS_AI2401").
     * @param hardware       Hardware identifier (e.g., "qcom").
     * @param board          Board identifier (can be null if not applicable).
     * @param bootloader     Bootloader version (can be null if not applicable).
     * @param refreshrate    Refresh rate of the device screen (e.g., "120").
     * @param username       Username associated with the device (optional).
     * @param hostname       Hostname of the device (optional).
     * @param fingerprint    Device fingerprint (optional).
     */
    public deviceInfo(
        String manufacturer,
        String brand, 
        String product, 
        String device, 
        String model, 
        String hardware, 
        String board, 
        String bootloader, 
        String refreshrate, 
        String username, 
        String hostname, 
        String fingerprint
        // String template  // Placeholder for future use
    ) {
        // Initialize all fields with provided values
        this.manufacturer   = manufacturer;
        this.brand          = brand;
        this.product        = product;
        this.device         = device;
        this.model          = model;
        this.hardware       = hardware;
        this.board          = board;
        this.bootloader     = bootloader;
        this.refreshrate    = refreshrate;
        this.username       = username;
        this.hostname       = hostname;
        this.fingerprint    = fingerprint;
        // this.template     = template;  // Uncomment if template is needed
    }
}