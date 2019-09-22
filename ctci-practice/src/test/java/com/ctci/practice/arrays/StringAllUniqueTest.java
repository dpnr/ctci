package com.ctci.practice.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.ctci.practice.arrays.StringAllUnique;

import org.junit.Test;

public class StringAllUniqueTest {
    @Test
    public void emptyStringShouldReturnTrue() {
        String empty = "";
        assertTrue(StringAllUnique.run(empty));
    }

    @Test
    public void basicUniqueCharsExample() {
        String basicUnique = "abc";
        assertTrue(StringAllUnique.run(basicUnique));
    }

    @Test
    public void basicRepeatingCharsExample() {
        String basicRepeating = "aac";
        assertFalse(StringAllUnique.run(basicRepeating));
    }
}
