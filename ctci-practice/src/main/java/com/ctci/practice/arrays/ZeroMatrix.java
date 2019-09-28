package com.ctci.practice.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * ZeroMatrix
 */
public class ZeroMatrix {

    public static List<List<Integer>> run(List<List<Integer>> givenMatrix) {
        if (givenMatrix.isEmpty()) {
            return givenMatrix;
        }
        int numRows = givenMatrix.size();
        int numCols = givenMatrix.get(0).size();
        List<Integer> zeroRows = new ArrayList<>();
        List<Integer> zeroCols = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (givenMatrix.get(i).get(j) == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        numRows = givenMatrix.size();
        numCols = givenMatrix.get(0).size();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (zeroRows.contains(i) || zeroCols.contains(j)) {
                    (givenMatrix.get(i)).set(j, (Integer) 0);
                }
            }
        }
        return givenMatrix;
    }
}