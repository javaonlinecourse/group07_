package com.javaonlinecourse.b3lesson2.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          24.11.2016
 */
public class ScalarVector {
    public static void main(String[] args) {
        System.out.println(scalar(new int[][]{
                { 1, 3, 4, 5, 6},
                { 3, 5, 6, 7, 8}
        }));
    }

    static int scalar(int[][] vector)
    {
        int sum = 0;
        for (int i = 0; i < vector[0].length; i++) {
            sum += vector[0][i] * vector[1][i];
        }
        return sum;
    }

}
