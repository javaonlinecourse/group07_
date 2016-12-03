package com.javaonlinecourse.b3lesson5.atm.command;

import com.javaonlinecourse.b3lesson5.atm.Currency;
import com.javaonlinecourse.b3lesson5.atm.exception.InterrupedOperationException;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.askCode;
import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.parseMoneyInput;
import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.writeMessage;
import static com.javaonlinecourse.b3lesson5.atm.CurrencyFactory.getCurrencyByCode;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
class DepositCommand implements Command {

    @Override
    public void execute() throws InterrupedOperationException {
        String currencyCode = askCode();
        Currency currency = getCurrencyByCode(currencyCode);
        int[] moneyInput = parseMoneyInput();
        currency.add(moneyInput[0], moneyInput[1]);
        writeMessage("Команда выполнена успешно");
    }
}
