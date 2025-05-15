package com.example.singleton;

import com.example.exception.PatternException;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages application configurations using the Singleton pattern.
 */
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> config;

    /**
     * Private constructor to prevent instantiation.
     */
    private ConfigurationManager() {
        config = new HashMap<>();
        config.put("appName", "DesignPatternsApp");
        config.put("version", "1.0");
    }

    /**
     * Gets the single instance of ConfigurationManager.
     * @return the instance
     */
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    /**
     * Gets a configuration value by key.
     * @param key the configuration key
     * @return the value
     * @throws PatternException if the key is invalid
     */
    public String getConfig(String key) throws PatternException {
        if (key == null || !config.containsKey(key)) {
            throw new PatternException("Invalid configuration key: " + key);
        }
        return config.get(key);
    }
}

