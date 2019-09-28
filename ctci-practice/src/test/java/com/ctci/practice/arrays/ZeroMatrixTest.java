package com.ctci.practice.arrays;

import static org.junit.Assert.assertArrayEquals;

import com.ctci.practice.arrays.ZeroMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * ZeroMatrixTest
 */
public class ZeroMatrixTest {

    @Test
    public void emptyMatrix() {
        List<List<Integer>> emptyMatrix = new ArrayList<List<Integer>>();
        assertArrayEquals(emptyMatrix.toArray(), ZeroMatrix.run(emptyMatrix).toArray());
    }

    @Test
    public void simple3x3Example() {
        List<List<Integer>> simple3x3Matrix = new ArrayList<List<Integer>>();

        simple3x3Matrix.add(Arrays.asList(new Integer[] { 1, 2, 3 }));
        simple3x3Matrix.add(Arrays.asList(new Integer[] { 4, 5, 6 }));
        simple3x3Matrix.add(Arrays.asList(new Integer[] { 7, 8, 9 }));

        //expected no change so 
        assertArrayEquals(simple3x3Matrix.toArray(), ZeroMatrix.run(simple3x3Matrix).toArray());
    }

    @Test
    public void simple3x3ExampleWithZero() {
        List<List<Integer>> simple3x3Matrix = new ArrayList<List<Integer>>();
        List<List<Integer>> expected3x3Matrix = new ArrayList<List<Integer>>();

        simple3x3Matrix.add(Arrays.asList(new Integer[] { 1, 2, 3 }));
        simple3x3Matrix.add(Arrays.asList(new Integer[] { 4, 0, 6 }));
        simple3x3Matrix.add(Arrays.asList(new Integer[] { 7, 8, 9 }));


        expected3x3Matrix.add(Arrays.asList(new Integer[] { 1, 0, 3 }));
        expected3x3Matrix.add(Arrays.asList(new Integer[] { 0, 0, 0 }));
        expected3x3Matrix.add(Arrays.asList(new Integer[] { 7, 0, 9 }));

        assertArrayEquals(expected3x3Matrix.toArray(), ZeroMatrix.run(simple3x3Matrix).toArray());
    }
}