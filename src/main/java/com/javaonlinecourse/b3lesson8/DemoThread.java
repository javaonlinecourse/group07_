package com.javaonlinecourse.b3lesson8;

import java.util.ArrayList;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class DemoThread extends Thread  {

    private Monitor t;

    public DemoThread(String name, Monitor t) {
        super(name);
        this.t = t;
    }

    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        Thread t1 = new DemoThread("Yo", monitor);
        Thread t2 = new DemoThread("Hey", monitor);

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName()
                + " завершился.");
    }

    @Override
    public void run() {
        t.hello(this);
        System.out.println(getName() + " завершился.");
    }
}

class Monitor{

    ArrayList<Integer> arrayList;

    void insert(int index){
        System.out.println();
        synchronized (arrayList){

        }
        System.out.println();
    }

    void read(int index){}

    public synchronized void hello(Thread t){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + " работает с числом " + i);
        }
    }
}
