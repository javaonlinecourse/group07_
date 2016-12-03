package com.javaonlinecourse.b3lesson5.atm;

/**
 * @author emitrohin
 * @version 1.0
 *          01.12.2016
 */
public enum Operation {
    LOGIN,
    INFO,
    WITHDRAW,
    DEPOSIT,
    QUIT;

    public static Operation getOperation(int i)
    {
        //TODO: Домашнее задание, изменить реализацию, используя values()
        switch (i)
        {
            case 1: return INFO;
            case 2: return WITHDRAW;
            case 3: return DEPOSIT;
            case 4: return QUIT;
            default: throw new IllegalArgumentException();
        }
    }

}
