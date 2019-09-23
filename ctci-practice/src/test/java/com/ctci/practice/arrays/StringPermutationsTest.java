package com.ctci.practice.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ctci.practice.arrays.StringPermutations;

import org.junit.Test;

/**
 * StringPermutationsTest
 */
public class StringPermutationsTest {
    @Test
    public void emptyStringShouldReturnEmpty() {
        String empty = "";
        StringPermutations sp = new StringPermutations();
        List<String> permutations =  sp.run(empty);
        assertTrue(permutations.isEmpty());
    }

    @Test
    public void simpleTestExample() {
        String inputString = "abc";
        List<String> expectedResults = Arrays.asList("abc", "acb", "bca", "bac", "cab", "cba");
        StringPermutations sp = new StringPermutations();
        List<String> actualResults =  sp.run(inputString);
        assertTrue(expectedResults.size() == actualResults.size() && expectedResults.containsAll(actualResults) && actualResults.containsAll(expectedResults));
    }
}