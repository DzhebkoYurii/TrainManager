package org.example.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class AppLogger {
    private static final Logger logger = Logger.getLogger("AppLogger");
    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("src/main/java/org/example/logger/LogFile.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to initialize log file handler: " + e.getMessage(), e);
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}
