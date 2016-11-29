package com.javaonlinecourse.b3lesson2.classwork;


/**
 * @author emitrohin
 * @version 1.0
 *          24.11.2016
 */
public class test2 {
    public static void main(String[] args) {
        String s = "string";
        s += new String("ss") + new String("ss2");
        System.out.println(s);
        s.charAt(1);
        s.length();
    }
}
