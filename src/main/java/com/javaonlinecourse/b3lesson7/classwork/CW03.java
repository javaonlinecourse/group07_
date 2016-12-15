package com.javaonlinecourse.b3lesson7.classwork;


/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class CW03 {

    class myClass extends NonGeneric{
        public myClass(Object object) {
            super(object);
        }

    }

    public static void main(String[] args) {
        GenericClassAndInterface<myClass> g;
    }
}
