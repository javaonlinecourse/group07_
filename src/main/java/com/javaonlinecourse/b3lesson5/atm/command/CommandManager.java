package com.javaonlinecourse.b3lesson5.atm.command;

import com.javaonlinecourse.b3lesson5.atm.Operation;
import com.javaonlinecourse.b3lesson5.atm.exception.InterrupedOperationException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
public class CommandManager {

    private static Map<Operation, Command> commands = new HashMap<>();

    static {
        commands.put(Operation.DEPOSIT, new DepositCommand());
        commands.put(Operation.INFO, new InfoCommand());
        commands.put(Operation.QUIT, new QuitCommand());
        commands.put(Operation.WITHDRAW, new WithdrawCommand());
        commands.put(Operation.LOGIN, new LoginCommand());
    }

    public static void execute(Operation operation) throws InterrupedOperationException {
        commands.get(operation).execute();
    }

    private CommandManager(){

    }
}
