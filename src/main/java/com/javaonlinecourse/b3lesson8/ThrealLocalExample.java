package com.javaonlinecourse.b3lesson8;

import java.util.HashMap;
import java.util.Map;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class ThrealLocalExample {
    public static void main(String[] args) throws InterruptedException {
        SomeBuilder builder = new SomeBuilder();

        class BuilderThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < Math.random() * 10; i++) {
                    builder.build();
                }
                System.out.println("I'm " + getName()
                        + " and I built " + builder.getCount());
            }
        }

        Thread t1 = new BuilderThread();
        Thread t2 = new BuilderThread();
        t1.start();
        t2.start();

        builder.build();
        System.out.println(builder.getCount());
    }
}

class SomeBuilder {
   // private final Map<Thread, Integer> counter = new HashMap<>();
    private final ThreadLocal<Integer> counter = new ThreadLocal<>();

    public void build() {
        System.out.println(Thread.currentThread().getName() + " builds...");
        if (counter.get() == null) {
            counter.set(0);
        }
        counter.set(counter.get() + 1);
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    public int getCount() {
        return counter.get();
    }
}