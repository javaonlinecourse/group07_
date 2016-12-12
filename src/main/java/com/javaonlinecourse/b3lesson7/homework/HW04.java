package com.javaonlinecourse.b3lesson7.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: E_Mitrohin
 * Date:   12.12.2016.
 *
 * Разберись, что делает программа.
 * Реализуй метод calculateMousesFinished. Он должен:
 * 1. Посчитать количество финишировавших мышей и возвратить его. Используйте метод hasFinished().
 * 2. Если мышь еще не пришла к финишу (!hasFinished()), то:
 * 2.1. Вывести в консоль "Ждем мышку " + mouse.getName().
 * 2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
 */
public class HW04 {
    public static int countMouses = 10;

    public static void main(String[] args) throws InterruptedException {
        List<Mouse> mouses = prepareMousesAndStart();
        while (calculateMousesFinished(mouses) != countMouses) {
        }
    }

    public static int calculateMousesFinished(List<Mouse> mouses) throws InterruptedException {
        //реализуй логику тут
        return 0;
    }

    public static class Mouse extends Thread {

        public Mouse(String name) {
            super(name);
        }

        private boolean hasFinished;

        public boolean hasFinished() {
            return hasFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   //delay
                s += "" + i;
                if (i == 1000) {
                    s = " завершила гонку!";
                    System.out.println(getName() + s);
                    hasFinished = true;
                }
            }
        }
    }

    public static List<Mouse> prepareMousesAndStart() {
        List<Mouse> mouses = new ArrayList<Mouse>(countMouses);
        String number;
        for (int i = 1; i < countMouses + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            mouses.add(new Mouse("Мышь_" + number));
        }

        for (int i = 0; i < countMouses; i++) {
            mouses.get(i).start();
        }
        return mouses;
    }
}
