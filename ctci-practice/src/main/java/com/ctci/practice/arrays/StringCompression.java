package com.ctci.practice.arrays;

/**
 * StringCompression
 */
public class StringCompression {

    public static String run(String inputString) {
        StringBuilder result = new StringBuilder();
        Character previous = ' ';
        int index = 0;
        int count = 0;
        while (index <= inputString.length()) {
            if (index == inputString.length()) {
                result.append(previous);
                result.append(String.valueOf(count));
                break;
            }
            else if (inputString.charAt(index) == previous) {
                count = count + 1;
            } else {
                if (previous != ' ') {
                    result.append(previous);
                    result.append(String.valueOf(count));
                }
                count = 1;
            }
            previous = inputString.charAt(index);
            index++;
        }

        return inputString.length() > result.toString().length() ? result.toString() : inputString;
    }
}