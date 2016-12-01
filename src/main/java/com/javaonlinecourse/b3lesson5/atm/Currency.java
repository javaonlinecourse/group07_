package com.javaonlinecourse.b3lesson5.atm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author emitrohin
 * @version 1.0
 *          01.12.2016
 */
public class Currency {

    private String currentCurrencyCode;
    private Map<Integer, Integer> money = new HashMap<>();

    public Currency(String currentCurrencyCode) {
        this.currentCurrencyCode = currentCurrencyCode;
    }

    public void add(int nominal, int amount){
        if (money.containsKey(nominal)) {
            money.put(nominal, money.get(nominal) + amount);
        } else {
            money.put(nominal, amount);
        }
    }


    public String getCurrentCurrencyCode() {
        return currentCurrencyCode;
    }

    public void setCurrentCurrencyCode(String currentCurrencyCode) {
        this.currentCurrencyCode = currentCurrencyCode;
    }

    public Map<Integer, Integer> getMoney() {
        return money;
    }

    public void setMoney(Map<Integer, Integer> money) {
        this.money = money;
    }
}
