package com.qap1_ssquire;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TimeTest {

    @Test
    public void testTimeClassExists() {
        assertTrue(Time.class.getName().equals("com.qap1_ssquire.Time"));
    }

    @Test
    public void testTimeConstructor() {
        Time time = new Time(12, 30, 30);
        assertEquals(12, time.getHour());
        assertEquals(30, time.getMinute());
        assertEquals(30, time.getSecond());
    }

    @Test
    public void testTimeConstraint() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertFalse(24 == time.getHour());
        assertFalse(60 == time.getMinute());
        assertFalse(60 == time.getSecond());
    }

}
