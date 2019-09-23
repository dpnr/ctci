package com.ctci.practice.arrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import com.ctci.practice.arrays.PermutationPalindrome;

/**
 * PermutationsPalindromeTest
 */
public class PermutationsPalindromeTest {

    @Test
    public void testEmptyString() {
        String empty = "";
        assertTrue("should return true", PermutationPalindrome.run(empty));
    }

    @Test
    public void simpleExample() {
        String simple = "lacz cal";
        assertTrue("should return true", PermutationPalindrome.run(simple));
    }
}