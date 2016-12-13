package com.javaonlinecourse.b3lesson7.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class CW01 {
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(150);
        generic.showClassName();

        int x = generic.getMyGenericObject();
        System.out.println("Значение х = " + x);

        NonGeneric nonGeneric = new NonGeneric(150);
        nonGeneric.showClassName();

        x = (Integer) nonGeneric.getMyGenericObject();
        System.out.println("Значение х = " + x);

        Generic<String> genericS = new Generic<>("Hello");
        NonGeneric nonGenericS = new NonGeneric("Hello");

        generic.showClassName();
        nonGeneric.showClassName();

        String s = genericS.getMyGenericObject();
        s = (String) nonGenericS.getMyGenericObject();
    }
}
