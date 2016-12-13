package com.javaonlinecourse.b3lesson7.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class Demo{
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++)
        {
            if(x.equals(y[i]))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] integers = { 1,5,8,9};

        if(isIn(5,integers))
            System.out.println("Число 5 содержится в массиве!");
    }
}
