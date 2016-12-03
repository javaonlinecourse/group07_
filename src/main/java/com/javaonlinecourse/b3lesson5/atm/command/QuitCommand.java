package com.javaonlinecourse.b3lesson5.atm.command;

import com.javaonlinecourse.b3lesson5.atm.exception.InterrupedOperationException;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.askYesNo;
import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.writeMessage;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
class QuitCommand implements Command {

    @Override
    public void execute() throws InterrupedOperationException {

        writeMessage("Вы действительно хотите выйти?");

        if(askYesNo()) {
            writeMessage("До свидания!");
        }

    }
}
