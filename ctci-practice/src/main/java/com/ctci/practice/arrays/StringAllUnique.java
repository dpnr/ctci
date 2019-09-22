package com.ctci.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class StringAllUnique {
    public static boolean run(String inputString) {
        if (inputString.isEmpty()) {
            return true;
        }
        Set<Character> seen = new HashSet<>();
        int i = 0;
        int n = inputString.length();
        while (i < n) {
            seen.add(inputString.charAt(i));
            i++;
        }

        return seen.size() == n;
    }
} 
    