package com.javaonlinecourse.b3lesson5.atm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author emitrohin
 * @version 1.0
 *          01.12.2016
 */
public class CurrencyFactory {

    private static Map<String, Currency> memory = new HashMap<>();

    public static Currency getCurrencyByCode(String code) {

        if (memory.containsKey(code)) {
            return memory.get(code);
        } else {
            Currency currency = new Currency(code);
            memory.put(code, currency);
            return currency;
        }

    }

    private CurrencyFactory() {
    }

    public static Collection<Currency> getAllCurrencies()
    {
        return memory.values();
    }

}
