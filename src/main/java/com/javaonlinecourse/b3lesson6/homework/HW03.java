package com.javaonlinecourse.b3lesson6.homework;

/**
 * Author: E_Mitrohin
 * Date:   09.12.2016.
 * Написать метод для конвертации массива любых объектов в ArrayList с использоватием generics.
 */
public class HW03 {
    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(4));
        System.out.println(persistence(25));
        System.out.println(persistence(999));
    }

    public static int persistence(long n) {

        if (n / 10 == 0) return 0;

        long next = n, mult = 1, result = 1;
        for (int i = String.valueOf(next).length(); i > 0; i--) {
            long digit = next % 10;
            mult *= digit;
            next /= 10;
        }

        if (mult / 10 != 0 ) result += persistence(mult);

        return (int) result;
    }
}