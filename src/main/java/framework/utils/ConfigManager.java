package framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static Properties properties = new Properties();

    static {
        String env = System.getProperty("env", "local");
        String path = "src/test/resources/config.properties";

        try (FileInputStream input = new FileInputStream(path)) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Faild on load config file from environment: " + env, e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void setToken(String token) {
        properties.setProperty("token", token);
    }
}

