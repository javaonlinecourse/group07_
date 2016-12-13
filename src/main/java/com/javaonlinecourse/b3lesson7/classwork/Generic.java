package com.javaonlinecourse.b3lesson7.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class Generic<T> {
    private T myGenericObject;

    Generic(T object)
    {
        myGenericObject = object;
    }

    public T getMyGenericObject() {
        return myGenericObject;
    }

    public void showClassName() {
        System.out.println("Типом Т является класс " + myGenericObject.getClass().getSimpleName());
    }
}

