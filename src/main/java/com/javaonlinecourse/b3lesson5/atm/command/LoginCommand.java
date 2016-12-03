package com.javaonlinecourse.b3lesson5.atm.command;

import com.javaonlinecourse.b3lesson5.atm.ATM;
import com.javaonlinecourse.b3lesson5.atm.exception.InterrupedOperationException;

import java.util.ResourceBundle;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.*;
/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
class LoginCommand implements Command {

    //TODO: реализовать блокировку при трех неудачах пин кода
    private ResourceBundle cards = ResourceBundle.getBundle(ATM.RESOURCE_PATH + "card");
    private ResourceBundle locale = ResourceBundle.getBundle(ATM.RESOURCE_PATH + "login");

    @Override
    public void execute() throws InterrupedOperationException {
        while (true) {
            writeMessage(locale.getString("entercard"));
            String card = readString();
            writeMessage(locale.getString("enterpin"));
            String pin = readString();

            if(cards.containsKey(card)){
               if(cards.getString(card).equals(pin)){
                   break;
               }
            }

            writeMessage(locale.getString("baddata"));
        }
    }
}
