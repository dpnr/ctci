package com.ctci.practice.arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import com.ctci.practice.arrays.StringCompression;

/**
 * StringCompressionTest
 */
public class StringCompressionTest {

    @Test
    public void emptyString() {
        String empty = "";
        String expected = "";
        String actual = StringCompression.run(empty);
        assertTrue("both strings equal :: ", actual.equals(expected));
    }

    @Test 
    public void basicExampleforCompression() {
        String basicExample = "aabbccc";
        String expected = "a2b2c3";
        String actual = StringCompression.run(basicExample);
        assertTrue("both strings equal :: ", actual.equals(expected));
    }

    @Test
    public void basicExampleforCompressionEqual() {
        String basicExample = "aabbcc";
        String expected = "aabbcc";
        String actual = StringCompression.run(basicExample);
        assertTrue("both strings equal :: ", actual.equals(expected));
    }
}