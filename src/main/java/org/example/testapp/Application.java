package org.example.testapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application class
 * @author Viktar Lebedzeu
 */
public class Application {
    /** Logger */
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String... args) {
        logger.info("This Application class does not do anything. Used for testing purpose only.");
    }
}
