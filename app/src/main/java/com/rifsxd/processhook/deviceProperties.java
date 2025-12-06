package com.rifsxd.processhook;

import de.robv.android.xposed.XposedBridge;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public final class deviceProperties {

    public static final Map<String, deviceInfo> DEVICE_MAP = new HashMap<>();

    // URL of the JSON hosted on GitHub
    private static final String GITHUB_JSON_URL = "https://raw.githubusercontent.com/rifsxd/hook/main/device_profile.json";

    static {
        XposedLog("Initializing deviceProperties...");

        deviceInfo profile = fetchDeviceProfileFromGitHub();

        if (profile != null) {
            DEVICE_MAP.put("com.squareup.cash", profile);
            XposedLog("Device profile loaded from GitHub successfully.");
        } else {
            XposedLog("Failed to load device profile from GitHub.");
        }
    }

    private static deviceInfo fetchDeviceProfileFromGitHub() {
        try {
            URL url = new URL(GITHUB_JSON_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int code = conn.getResponseCode();
            if (code != 200) {
                XposedLog("GitHub request failed with code: " + code);
                return null;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();

            JSONObject obj = new JSONObject(sb.toString());

            return new deviceInfo(
                    obj.optString("manufacturer", null),
                    obj.optString("brand", null),
                    obj.optString("product", null),
                    obj.optString("device", null),
                    obj.optString("model", null),
                    obj.optString("hardware", null),
                    obj.optString("board", null),
                    obj.optString("bootloader", null),
                    obj.optString("refresh_rate", null),
                    obj.optString("user", null),
                    obj.optString("host", null),
                    obj.optString("fingerprint", null)
            );

        } catch (Exception e) {
            XposedLog("Failed to fetch GitHub JSON: " + e.getMessage());
            return null;
        }
    }

    private static void XposedLog(String msg) {
        XposedBridge.log("[DeviceProfile] " + msg);
    }
}
