package com.javaonlinecourse.b3lesson6.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          06.12.2016
 */
interface Anonymous {
    boolean jump(boolean b);
    void sit(String s);

    static Table create(int size){
        return new Table() {
            private int x = 1;

            public boolean jump(boolean b){
                return true;
            }
        };

    }

}

class Table{

}
