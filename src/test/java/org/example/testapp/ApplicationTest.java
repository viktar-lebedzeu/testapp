package org.example.testapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test suite for testing Application features
 * @author Viktar Lebedzeu
 */
public class ApplicationTest {

    @Test
    public void testMain() {
        Application.main();
        Assertions.assertTrue(true);

    }
}
