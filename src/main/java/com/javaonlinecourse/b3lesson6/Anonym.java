package com.javaonlinecourse.b3lesson6;

import java.math.BigInteger;

/**
 * @author emitrohin
 * @version 1.0
 *          06.12.2016
 */
public class Anonym {
    public static void main(String[] args) {
        new Flyable(){
            @Override
            public void fly() {
                System.out.println("I'm flying!");
            }

            @Override
            public void land() {

            }

            @Override
            public int increaseHeight(int height) {
                return 0;
            }

            @Override
            public int decreaseHeight(int height) {
                return 0;
            }
        }.fly();

        int x = 123;

        Thread t = new Thread(

            new Runnable(){
                @Override
                public void run() {
                    System.out.println("Oh!");
                }

        });
        t.run();

        System.out.println(new BigInteger("123"){

            private int x;

            {
                x = 123;
            }

            void hahahahaha(){
                System.out.println("HHAHAHAH!");
            }

            @Override
            public BigInteger add(BigInteger val) {
                return super.subtract(val);
            }
        }.add(BigInteger.ONE));
    }
}
