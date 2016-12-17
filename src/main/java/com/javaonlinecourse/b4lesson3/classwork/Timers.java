package com.javaonlinecourse.b4lesson3.classwork;

import java.util.*;


/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class Timers {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(true);
        TimerTask taskPeriod = new TimerTask(){
            @Override
            public void run() {
                System.out.println("переодически");
            }
        };

        TimerTask taskOnce = new TimerTask(){
            @Override
            public void run() {
                System.out.println("единоджы");
            }
        };

        Calendar c = GregorianCalendar.getInstance();

        c.add(Calendar.SECOND, 1);
        timer.schedule(taskPeriod, c.getTime(), 1000);

        c.add(Calendar.SECOND, 2);
        timer.schedule(taskOnce, c.getTime());
        Thread.sleep(10000);
    }
}
