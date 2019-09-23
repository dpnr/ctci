package com.ctci.practice.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * PermutationPalindrome
 */
public class PermutationPalindrome {

    public static boolean run(String inputString) {
        Map<Character, Integer> counter = new HashMap<>();
        int index = inputString.isEmpty() ? -1 : 0;
        int countOdds = 0;
        while (0 <= index && index < inputString.length()) {
            Character ch = inputString.charAt(index);
            if (Character.isLetterOrDigit(ch)) {
                counter.put(ch, counter.getOrDefault(ch, 0) + 1);
            }
            index++;
        }
        for (Character key : counter.keySet()) {
            if (counter.get(key) % 2 != 0) {
                countOdds++;
            }
        }

        return countOdds <= 1;
    }
}