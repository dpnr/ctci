package com.ctci.practice.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * StringPermutations
 */
public class StringPermutations {
    private List<String> results;

    public StringPermutations() {
        this.results = new ArrayList<>();
    }

    public List<String> run(String inputString) {
        StringBuilder current = new StringBuilder("");
        StringBuilder remaining = new StringBuilder(inputString);
        allPermutations(current, remaining);
        return this.results;
    } 

    private void allPermutations(StringBuilder currentStr, StringBuilder remainingStr) {
        if (remainingStr.toString().isEmpty() && !currentStr.toString().isEmpty()) {
            this.results.add(currentStr.toString());
        }
        
        for (int i = 0; i < remainingStr.length(); i++) {
            StringBuilder current = new StringBuilder(currentStr);
            StringBuilder remaining = new StringBuilder(remainingStr);
            allPermutations(current.append(remaining.charAt(i)), remaining.delete(i, i+1));
        } 
    }
}