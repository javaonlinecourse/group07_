package com.javaonlinecourse.b3lesson8.deadlock;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() throws InterruptedException {
        Thread.currentThread().setName("Главный поток");
        Thread t1 = new Thread(this, "Конкурирующий поток");
        t1.start();

        a.a(b);
        System.out.println("Назад  главный поток");
    }

    @Override
    public void run() {
        try {
            b.b(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) throws InterruptedException {
        new Deadlock();
    }
}
