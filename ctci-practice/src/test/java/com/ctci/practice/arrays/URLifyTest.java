package com.ctci.practice.arrays;

import static org.junit.Assert.assertEquals;

import java.lang.annotation.Target;

import com.ctci.practice.arrays.URLify;

import org.junit.Test;

/**
 * URLifyTest
 */
public class URLifyTest {
    @Test
    public void emptyShouldReturnEmpty() {
        String empty = "";
        String expected = "";
        String actual = String.valueOf(URLify.run(empty));
        assertEquals("both the string should be equal", expected, actual);
    }

    @Test
    public void simpleOneSpace() {
        String oneSpace = "   ";
        String expected = "%20";
        String actual = String.valueOf(URLify.run(oneSpace));
        assertEquals("both the string should be equal", expected, actual);
    }

    @Test
    public void simpleExampleWithOneSpaces() {
        String oneSpaceSimple = "Hey Pranav  ";
        String expected = "Hey%20Pranav";
        String actual = String.valueOf(URLify.run(oneSpaceSimple));
        assertEquals("both the string should be equal", expected, actual);
    }
}