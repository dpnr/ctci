package com.ctci.practice.arrays;

/**
 * URLify
 */
public class URLify {
    public static char[] run(String inputString) {
        char[] input = inputString.toCharArray();
        int secondPointer, firstPointer;
        secondPointer = input.length - 1;
        firstPointer = secondPointer >= 2 ? 0 : -1;
        int i = 0;
        for (char inputChar : input) {
            if (inputChar != ' ') {
                firstPointer = i;
            }
            i++;
        }
        while(firstPointer >= 0) {
            if (input[firstPointer] == ' ') {
                input[secondPointer--] = '0';
                input[secondPointer--] = '2';
                input[secondPointer--] = '%';
            }
            else {
                input[secondPointer--] = input[firstPointer];
            }
            firstPointer--;
        }
        return input;
    }
}