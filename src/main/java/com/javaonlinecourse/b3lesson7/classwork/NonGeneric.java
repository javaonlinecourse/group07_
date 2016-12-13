package com.javaonlinecourse.b3lesson7.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class NonGeneric {
    private Object myGenericObject;

    NonGeneric(Object object)
    {
        myGenericObject = object;
    }

    public Object getMyGenericObject() {
        return myGenericObject;
    }

    public void showClassName() {
        System.out.println("Типом Т является класс " + myGenericObject.getClass().getSimpleName());
    }
}
