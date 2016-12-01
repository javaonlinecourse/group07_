package com.javaonlinecourse.b3lesson4.classwork;


import java.util.ArrayList;

/**
 * @author emitrohin
 * @version 1.0
 *          29.11.2016
 */
public class CW02 {

    public static void main(String[] args) {
        Integer i = 2;
        Integer x = Integer.valueOf(2);

        i++;

    }

    @Deprecated
    @MyMetaData(value = "gg", integer = 54)
    public static void test(){
        System.out.println("Ye old one!");
    }
}
