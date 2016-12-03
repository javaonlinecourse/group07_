package com.javaonlinecourse.b3lesson5.atm;

import com.javaonlinecourse.b3lesson5.atm.exception.NotEnoughMoneyException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author emitrohin
 * @version 1.0
 *          01.12.2016
 */
public class Currency {

    //TODO: Домашнее задание, изменить тип currentCurrencyCode на enum
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

    public int getTotalAmount(){
        int result = 0;
        for (Map.Entry<Integer, Integer> pair: money.entrySet()) {
            result += pair.getKey()  * pair.getValue();
        }

        return result;
    }

    public boolean hasMoney(){
        return money.size() != 0;
    }

    public boolean isAmountAvailable(int amount)
    {
        return amount < getTotalAmount();
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

    public void withdraw(int sum) throws NotEnoughMoneyException{

        //TODO: Реализовать алгоритм
        //Выдача должна возвращать минимальное количество банкнот, которыми можно выдать запрашиваемое количество
        //  Жадный алгоритм
        //выдачу пономинально вывести в консоль
        //пример:
        // вывести 1000
        // 500 - 1
        // 100 - 5

        //Нельзя выдать одни и теже банкноты повторно, проследить, чтобы выданные банкноты удалились из memory

        //Если нет возможности выдать текущими купюрами требуемое количество банкнот, то кинуть NotEnoughMoneyException
    }
}
