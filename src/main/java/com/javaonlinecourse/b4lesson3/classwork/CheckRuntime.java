package com.javaonlinecourse.b4lesson3.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class CheckRuntime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int x = i * i;
            System.out.println(x);
        }
        long endTime = System.currentTimeMillis();
        long result = ( endTime - startTime ) / 1000;
        System.out.println("Результат: " + (startTime - endTime) + " сек.");
        System.out.println("Результат: " + result + " сек.");
    }
}
