package com.javaonlinecourse.b3lesson8;

/**
 * @author emitrohin
 * @version 1.0
 *          10.12.2016
 */
public class Interruptable implements Runnable
{
    public static void main(String[] args) {
        new Thread(new Interruptable()).start();
    }

    @Override
    public void run() {
        boolean isActive = true;
        for (int i = 1; i <= 100000; i++) {
            if (isActive) {
                if (i == 50000)
                {
                    Thread.currentThread().interrupt();
                    isActive = false;
                }
                System.out.println(i + " " + Thread.currentThread().isDaemon());
            } else {
                break;
            }
        }
    }
}
