package com.javaonlinecourse.b3lesson5.atm;

import com.javaonlinecourse.b3lesson5.atm.exception.NotEnoughMoneyException;

import java.util.*;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.writeMessage;

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

    public void withdraw(int expectedAmount) throws NotEnoughMoneyException{

        Map<Integer, Integer> temp = new HashMap<>();
        temp.putAll(money);

        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> pair: temp.entrySet())
            list.add(pair.getKey());

        Collections.sort(list);
        Collections.reverse(list);

        Map<Integer, Integer> result = new TreeMap<>();

        for (Integer nominal : list)
        {
            int value = temp.get(nominal);
            while (true){
                if (expectedAmount < nominal || value <=0)
                {
                    temp.put(nominal, value);
                    break;
                }

                expectedAmount -=nominal;
                value--;

                if (result.containsKey(nominal))
                    result.put(nominal, result.get(nominal ) + 1);
                else
                    result.put(nominal, 1);
            }
        }

        if (expectedAmount > 0)
            throw new NotEnoughMoneyException();
        else {
            for (Map.Entry<Integer, Integer> pair: result.entrySet())
            {
                writeMessage("\t" + pair.getKey() + " - " + pair.getValue());

                if (money.containsKey(pair.getKey())) {
                    money.put(pair.getKey(), money.get(pair.getKey()) - pair.getValue());
                }
            }

            writeMessage("Транзакция прошла успешно");
        }
    }
}
