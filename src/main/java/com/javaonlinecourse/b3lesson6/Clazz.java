package com.javaonlinecourse.b3lesson6;

import com.javaonlinecourse.b1lesson4.classwork.Methods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author emitrohin
 * @version 1.0
 *          06.12.2016
 */

public class Clazz {
    public static void main(String[] args) throws ClassNotFoundException {
      /*  BigInteger b = BigInteger.ONE;
        Class clazz = b.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Class cInteger = Integer.class;
        Class cint =     int.class;



        try {
            BigInteger instance = (BigInteger) fromString.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }*/

        Class fromString = Class.forName("java.math.BigInteger");
        System.out.println(fromString.getSimpleName() + "@");

        Constructor[] ctor = fromString.getConstructors();
        for (Constructor c:ctor) {
            System.out.print(c.getName() + " ");
            Parameter[] params = c.getParameters();
            for (Parameter p: params) {
                System.out.print(p.getType().getSimpleName() + " ");
            }
            System.out.println();
        }

        Method[] methods = fromString.getMethods();
        for (Method m: methods)
        {
            System.out.print(m.getName() + " ");
            Parameter[] params = m.getParameters();
            for (Parameter p: params) {
                System.out.print(p.getType().getSimpleName() + " ");
            }
            System.out.println();

        }

        //URLClassLoader cl = URLClassLoader.newInstance(new URL[]{ });
    }
}
