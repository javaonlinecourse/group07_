package com.javaonlinecourse.b4lesson;

import java.util.Date;

/**
 * @author emitrohin
 * @version 1.0
 *          13.12.2016
 */
public class GCTest {
    public static void main(String[] args) throws Throwable {
        Object a = new Integer(100);  // Line1
        Object b = new Long(100);     // Line2
        Object c = new String("100"); // Line3
        a = null;                     // Line4
        a = c;                        // Line5
        c = b;                        // Line6
        b = a;                        // Line7

        Runtime.getRuntime().exit(5);
    }
}
