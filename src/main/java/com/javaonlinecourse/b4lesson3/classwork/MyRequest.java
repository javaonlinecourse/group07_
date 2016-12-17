package com.javaonlinecourse.b4lesson3.classwork;

import java.util.Arrays;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class MyRequest {
    public static void main(String[] args) {
        int[] k = {1,5,67,9,34,7,89,0,7};
        Arrays.asList(k).forEach(x -> System.out.println(x));
    }
}

class lamblaPerformer{
    static boolean performNumericTest(NumericTest f, int t) {
        return f.test(t);
    }
}

@FunctionalInterface
interface NumericTest {
    boolean test(int n);

    default void bb(){
        System.out.println("dfg");
    }
}
