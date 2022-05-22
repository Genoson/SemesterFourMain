package com.classexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testAppVariableExists() {
        App app = new App();
        assertEquals("Hello World", app.testMe);
    }

    @Test
    void testAlwaysTrue() {
        Assertions.assertTrue(true);
    }
}
