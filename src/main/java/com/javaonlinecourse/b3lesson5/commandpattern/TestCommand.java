package com.javaonlinecourse.b3lesson5.commandpattern;

import com.javaonlinecourse.b3lesson5.commandpattern.commands.Command;
import com.javaonlinecourse.b3lesson5.commandpattern.commands.MoveCommand;
import com.javaonlinecourse.b3lesson5.commandpattern.commands.StopCommand;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
public class TestCommand {
    public static void main(String[] args) {
        Car car = new Car();
        Command move = new MoveCommand(car);
        Command stop = new StopCommand(car);

        CommandManager commandManager = new CommandManager(stop, move);

        commandManager.move();
        commandManager.stop();
    }
}
