package com.javaonlinecourse.b3lesson5.atm;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.*;
import static com.javaonlinecourse.b3lesson5.atm.CurrencyFactory.*;
/**
 * @author emitrohin
 * @version 1.0
 *          01.12.2016
 *
 *          банкомат
 *          поместить деньги, снять деньги, показать состояние банкомата.
 *          мультивалютность
 *
 */
public class ATM {
    public static void main(String[] args) {
        writeMessage("Добро пожаловать в наш скромный банкомат.");
        String currencyCode = askCode();
        Currency currency = getCurrencyByCode(currencyCode);
        int[] moneyInput = parseMoneyInput();
        currency.add(moneyInput[0], moneyInput[1]);
        writeMessage("Спасибо, что зашли к нам");
    }
}
