package lii.autotextprocessor4dataflow.util;

import java.io.*;
import java.util.Properties;

public class ConfigManager {

    private final Properties properties;
    private final String configFilePath;


    public ConfigManager(String configFilePath) {
        this.configFilePath = configFilePath;
        this.properties = new Properties();
        loadProperties();
    }

    // Method to load properties from the file
    private void loadProperties() {
        try (InputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        } catch (IOException e) {
            AppLogger.logWarning("Could not load properties: " + e.getMessage());
        }
    }

    // Method to get a property value
    public String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    // Method to set a property value
    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }

    // Method to save properties to the file
    public void saveProperties() {
        try (OutputStream output = new FileOutputStream(configFilePath)) {
            properties.store(output, "Application Configuration");
        } catch (IOException e) {
            AppLogger.logError("Could not save properties", e);
        }
    }
}