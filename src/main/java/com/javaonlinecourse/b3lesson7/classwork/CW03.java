package com.javaonlinecourse.b3lesson7.classwork;

import com.javaonlinecourse.b3lesson6.Flyable;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class CW03 {

    class myClass extends NonGeneric implements Flyable{
        public myClass(Object object) {
            super(object);
        }

        @Override
        public void fly() {

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
    }

    public static void main(String[] args) {
        GenericClassAndInterface<myClass> g;
    }
}
