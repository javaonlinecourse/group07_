package com.javaonlinecourse.b3lesson5.atm;

import com.javaonlinecourse.b3lesson5.atm.command.CommandManager;
import com.javaonlinecourse.b3lesson5.atm.exception.InterrupedOperationException;

import java.util.Locale;

import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.askOperation;
import static com.javaonlinecourse.b3lesson5.atm.ConsoleHelper.writeMessage;


/**
 * @author emitrohin
 * @version 1.0
 *          01.12.2016
 *          <p>
 *          банкомат
 *          поместить деньги, снять деньги, показать состояние банкомата.
 *          мультивалютность
 */
public class ATM {

    public static final String RESOURCE_PATH = "com.javaonlinecourse.b3lesson5.atm.resources.";

    public static void main(String[] args) {

        //TODO: добавить выбор языка через консоль

        try {
            CommandManager.execute(Operation.LOGIN);

            writeMessage("Добро пожаловать в банкомат.\n" +
                    "Доступные команды\n1 - Информация, 2 - Снять деньги,3 - положить деньги, 4 - выход");
            Operation operation = null;
            do {
                writeMessage("Введите код команды:");
                operation = askOperation();
                CommandManager.execute(operation);
            } while (operation != Operation.QUIT);
        } catch (InterrupedOperationException e) {
            try{
                CommandManager.execute(Operation.QUIT);
            } catch (InterrupedOperationException x){

            }
        }
    }
}
