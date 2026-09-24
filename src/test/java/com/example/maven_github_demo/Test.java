package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GradecalculatorTest {

    @Test
    void testTotal() {
        assertEquals(225, Gradecalculator.calculateTotal(75, 68, 82));
    }

    @Test
    void testAverage() {
        assertEquals(75.0, Gradecalculator.calculateAverage(75, 68, 82));
    }

    @Test
    void testPass() {
        assertTrue(Gradecalculator.ispass(75.0));
    }

    @Test
    void testFail() {
        assertFalse(Gradecalculator.ispass(35.0));
    }
}
