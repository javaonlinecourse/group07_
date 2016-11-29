package com.javaonlinecourse.b3lesson2.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          24.11.2016
 */
public class Perfect {
    public static void main(String[] args) {

        for (int i = 1; i <= 10_000; i++) {
            isPerfect(i);
        }

    }

    static void isPerfect(int x)
    {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        if (sum == x) {
            System.out.println("Число " + x + " совершенное");
        }
    }

}
