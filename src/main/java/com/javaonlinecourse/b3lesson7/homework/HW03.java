package com.javaonlinecourse.b3lesson7.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

/**
 * Author: E_Mitrohin
 * Date:   12.12.2016.
 *
 * Раскомментируйте код
 * Измените класс Violin так, чтоб он помещался в конструктор для Thread.
 * Main должен выводить в консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".
 *
 *
 */
public class HW03 {
    /*public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static class Violin{
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public LocalDateTime startPlaying() {
            System.out.println(this.owner + " starts playing");
            return LocalDateTime.now();
        }

        public LocalDateTime stopPlaying() {
            System.out.println(this.owner + " stops playing");
            return LocalDateTime.now();
        }


    }

    public static int delay = 1000;

    public static void sleepNSeconds(int n) {
        try {
            TimeUnit.MILLISECONDS.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument{
        LocalDateTime startPlaying();

        LocalDateTime stopPlaying();

        default void run() {
            long startDate = startPlaying().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            sleepNSeconds(1);
            long stopDate = stopPlaying().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long time = stopDate - startDate;
            System.out.println("Playing "+time+" ms");
        }
    }*/
}
