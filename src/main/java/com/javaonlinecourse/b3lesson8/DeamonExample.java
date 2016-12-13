package com.javaonlinecourse.b3lesson8;

import java.util.Random;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class DeamonExample {
    public static void main(String[] args) {
        Thread t1 = new Thread("Бизнес-логика"){
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {

                    }
                    System.out.println("Количество клиентов " + i);
                }
            }
        };

        Thread t2 = new Thread("Контроль соединения с интернетом"){
            @Override
            public void run() {
                Random r = new Random();
                while (true){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                    System.out.println("Скорость соединения с интернетом " +
                            r.nextInt(100) + "кб/с");
                }
            }
        };

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
