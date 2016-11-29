package com.javaonlinecourse.b3lesson3.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          25.11.2016
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            throw new Error();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println();
        }
    }
}
