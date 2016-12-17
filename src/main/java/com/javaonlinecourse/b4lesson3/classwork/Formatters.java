package com.javaonlinecourse.b4lesson3.classwork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class Formatters {
    public static void main(String[] args) {
        DateFormat formatter = new SimpleDateFormat("yyyy/MMMM/dd");
        Date date = new Date(116, 1, 5);
        System.out.println(formatter.format(date));
    }
}
