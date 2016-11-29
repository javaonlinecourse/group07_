package com.javaonlinecourse.b3lesson2.classwork;

/**
 * Author: E_Mitrohin
 * Date:   23.11.2016.
 */
public class CW04 {
    public static void main(String[] args) {

        breakme:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (j == 8) break breakme;
                }
            }
        }

        int o = 0;

        m: {
            System.out.println("sdf");
            System.out.println("sdf");
            if (false) break m;
            System.out.println("sdf");
            System.out.println("sdf");
        }

    }
}
