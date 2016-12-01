package com.javaonlinecourse.b3lesson4.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          29.11.2016
 */
public enum Planet {
    Sun(50000, false, 50D),
    Mercury(2000, false, 5D),
    Venus(5000, false, 8D),
    Earth(6000, true, 9.8),
    Mars(6000, false),
    Jupiter;

    private int size;
    private boolean hasLife;
    private double gravity;

    Planet(int size, boolean hasLife, double gravity){
        this.size = size;
        this.hasLife = hasLife;
        this.gravity = gravity;
    }

    Planet(int size, boolean hasLife) {
        this.size = size;
        this.hasLife = hasLife;
    }

    Planet() {
        this.size = 0;
        this.hasLife = false;
        this.gravity = 0D;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }
}
