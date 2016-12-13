package com.javaonlinecourse.b3lesson8.deadlock;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class A {

    volatile int x;

    public synchronized void a(B b) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " вошел в метод а()");

        Thread.sleep(1000);

        System.out.println("Вызываем message у b");
        b.message();
    }

    public synchronized void message(){
        System.out.println("В методе A.message()");
    }
}
