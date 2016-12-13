package com.javaonlinecourse.b3lesson8;


/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class TestRunnable extends Number implements Runnable{

    @Override
    public void run() {

    }

    public TestRunnable() {
        super();
    }

    @Override
    public byte byteValue() {
        return super.byteValue();
    }

    @Override
    public short shortValue() {
        return super.shortValue();
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    public static void main(String[] args) {
        new Thread(new TestRunnable()).start();
    }
}
