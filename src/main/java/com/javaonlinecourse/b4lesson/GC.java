package com.javaonlinecourse.b4lesson;

/**
 * @author emitrohin
 * @version 1.0
 *          13.12.2016
 */
public class GC {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("DF");
    }
}
