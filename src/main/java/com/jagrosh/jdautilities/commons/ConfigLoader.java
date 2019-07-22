package com.jagrosh.jdautilities.commons;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.typesafe.config.ConfigFactory;

public final class ConfigLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigLoader.class);
    private static final String CONFIG_SYSTEM_PROP = "config.file";
    private static final com.typesafe.config.Config CONFIG;
    static {
        Path path = Paths.get(System.getProperty(CONFIG_SYSTEM_PROP, System.getProperty("config", "config.txt")));
        if (path.toFile().exists()) {
            LOGGER.info("Loaded config from {}",
                path.toFile().getAbsolutePath());
            if (System.getProperty(CONFIG_SYSTEM_PROP) == null) {
                System.setProperty(CONFIG_SYSTEM_PROP, System.getProperty("config", "config.txt"));
            }
            ConfigFactory.invalidateCaches();
        }
        CONFIG = ConfigFactory.load();
    }

    private ConfigLoader() {
    }

    public static com.typesafe.config.Config getConfig() {
        return CONFIG;
    }
}