package com.javaonlinecourse.b3lesson5.atm.command;

import com.javaonlinecourse.b3lesson5.atm.Currency;
import com.javaonlinecourse.b3lesson5.atm.CurrencyFactory;
import com.javaonlinecourse.b3lesson5.atm.exception.InterrupedOperationException;
import com.javaonlinecourse.b3lesson5.atm.exception.NotEnoughMoneyException;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.readString;
import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.writeMessage;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
class WithdrawCommand implements Command {

    @Override
    public void execute() throws InterrupedOperationException {
        writeMessage("Введите код валюты:");
        String code = readString();
        Currency currency = CurrencyFactory.getCurrencyByCode(code);

        int sum;
        while (true) {
            try {
                sum = Integer.parseInt(readString());
            } catch (NumberFormatException e) {
                writeMessage("Неверный ввод данных. Повторите");
                continue;
            }

            if (sum <= 0){
                writeMessage("Неверный ввод данных. Повторите");
                continue;
            }

            if(currency.isAmountAvailable(sum)){
                try {
                    currency.withdraw(sum);
                } catch (NotEnoughMoneyException e) {
                    writeMessage("Нет таких денег в банкомате. Повторите ввод");
                }
                writeMessage("Успешная выдача средств.");
                break;
            }else {
                writeMessage("Нет таких денег в банкомате. Повторите ввод");
            }
        }

    }
}
