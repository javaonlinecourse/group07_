package com.javaonlinecourse.b3lesson7.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class Average<T extends Number> {
    T[] numbers;

    Average(T[] object)
    {
        numbers = object;
    }

    public double calc()
    {
        double sum = 0D;
        for (T x: numbers)
        {
            sum += x.doubleValue();
            return sum / numbers.length;
        }
        return sum;
    }

    public boolean checkAverage(Average<?> another)
    {
        return this.calc() == another.calc();
    }

}
