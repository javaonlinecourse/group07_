package com.javaonlinecourse.b3lesson7.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class GenericTypeTwo<myType, mySecondType> {

    private myType myGenericObject;
    private myType myGenericObject2;

    private mySecondType myField;
    private mySecondType myField2;

    GenericTypeTwo(myType object, mySecondType object2)
    {
        myGenericObject = object;
        myField = object2;
    }

    public myType getMyGenericObject() {
        return myGenericObject;
    }

    public void showClassName() {
        System.out.println("Типом Т является класс " + myGenericObject.getClass().getSimpleName());
    }
}

