package com.javaonlinecourse.b3lesson8.deadlock;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class B {
    public synchronized void b(A a) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " вошел в метод b()");

        Thread.sleep(1000);

        System.out.println("Вызываем message у a");
        a.message();
    }

    public synchronized void message(){
        System.out.println("В методе A.message()");
    }
}
