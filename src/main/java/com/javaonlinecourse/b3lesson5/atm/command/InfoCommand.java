package com.javaonlinecourse.b3lesson5.atm.command;

import com.javaonlinecourse.b3lesson5.atm.Currency;
import com.javaonlinecourse.b3lesson5.atm.CurrencyFactory;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.writeMessage;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
class InfoCommand implements Command{

    @Override
    public void execute() {
        boolean flag = false;
        for (Currency currency : CurrencyFactory.getAllCurrencies())
        {
            if (currency.hasMoney()){
                if (currency.getTotalAmount() > 0)
                {
                    writeMessage(currency.getCurrentCurrencyCode()
                            + " " + currency.getTotalAmount());
                    flag = true;
                }
            }
        }
        if (!flag) writeMessage("Денег нет");
    }
}
