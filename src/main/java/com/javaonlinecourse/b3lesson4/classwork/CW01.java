package com.javaonlinecourse.b3lesson4.classwork;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author emitrohin
 * @version 1.0
 *          29.11.2016
 */
public class CW01{
    public static void main(String[] args) {
        Planet planet = Planet.Earth;
        String result = (planet.equals(Planet.Mars)) ?
            "Отличаются" : "Равны";
        System.out.println(result);
    }

    public static void execute(Command c)
    {

    }

}
