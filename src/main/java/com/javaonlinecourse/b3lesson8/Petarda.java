package com.javaonlinecourse.b3lesson8;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class Petarda {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Через 20 секунд взорвется петарда");
        for (int i = 20; i > 0; i--) {
            Thread.sleep(100);
            System.out.println("Взрыв через " + i);
        }

    }

}
