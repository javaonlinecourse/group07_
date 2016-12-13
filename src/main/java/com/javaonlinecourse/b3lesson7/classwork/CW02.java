package com.javaonlinecourse.b3lesson7.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class CW02 {
    public static void main(String[] args) {
        Number number = new Double(55);

        Generic numberGeneric = new Generic<Integer>(55);

        Integer[] ints = {7,8,9,10,11};
        Double[] doubles = {1.5, 3.7, 8.8, 9.0};

        Average<Integer> avInt = new Average<>(ints);
        Average<Double> avDbl = new Average<>(doubles);
        //Average<Number> avDblNumber = new Average<>(doubles);

        System.out.println("Среднее равно + " + avInt.calc());
        System.out.println("Среднее равно + " + avDbl.calc());
        //System.out.println("Среднее равно + " + avDblNumber.calc());

        //Average<String> avStr = new Average<>(new String[]{"asd","asd","asd"});

        if(avInt.checkAverage(avDbl))
            System.out.println("Равны");
        else
            System.out.println("Не равны");
    }
}
