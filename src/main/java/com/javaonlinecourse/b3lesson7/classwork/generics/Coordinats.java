package com.javaonlinecourse.b3lesson7.classwork.generics;

import java.util.ArrayList;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public class Coordinats<T extends TwoD> {

    private T[] coordinats;

    public Coordinats(T[] coordinats) {
        this.coordinats = coordinats;
    }

    static void showXY(Coordinats<?> c) {
        System.out.println("Коодинаты X и Y: ");
        for (int i = 0; i < c.coordinats.length; i++) {
            System.out.println(c.coordinats[i].x + " " + c.coordinats[i].y);
        }

        System.out.println();
    }

    static void showXYZ(Coordinats<? super ThreeD> c) {
        System.out.println("Коодинаты X и Y: ");
        for (int i = 0; i < c.coordinats.length; i++) {
            System.out.println(c.coordinats[i].x + " " + c.coordinats[i].y + " " + c.coordinats[i].y);
        }

        System.out.println();
    }

    static void showAll(Coordinats<? extends FourD> c) {
        System.out.println("Коодинаты X и Y: ");
        for (int i = 0; i < c.coordinats.length; i++) {
            System.out.println(c.coordinats[i].x + " " +
                    c.coordinats[i].y + " " +
                    c.coordinats[i].z + " " +
                    c.coordinats[i].t);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] twoDS = {
                new TwoD(0, 1),
                new TwoD(1, 2),
                new TwoD(3, 4)
        };

        ThreeD[] threeDS = {
                new ThreeD(0, 1, 5),
                new ThreeD(1, 2, 5),
                new ThreeD(3, 4, 5)
        };

        FourD[] fourDS = {
                new FourD(0, 1, 5, 8),
                new FourD(1, 2, 5, 8),
                new FourD(3, 4, 5, 8)
        };

        Coordinats<TwoD> twoDCoordinats = new Coordinats<>(twoDS);
        System.out.println("Содержимое twoDCoordinats");
        showXY(twoDCoordinats);

        Coordinats<ThreeD> threeDCoordinats = new Coordinats<>(threeDS);
        showXY(threeDCoordinats);
        showXYZ(threeDCoordinats);

        Coordinats<FourD> fourDCoordinats = new Coordinats<>(fourDS);
        showXY(fourDCoordinats);
        showAll(fourDCoordinats);
        throw new RuntimeException();
    }
}
