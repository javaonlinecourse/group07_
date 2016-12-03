package com.javaonlinecourse.b3lesson5.commandpattern;

import com.javaonlinecourse.b3lesson5.commandpattern.commands.Command;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
public class CommandManager {

    private Command stopCommand;
    private Command moveCommand;

    public CommandManager(Command stopCommand, Command moveCommand) {
        this.stopCommand = stopCommand;
        this.moveCommand = moveCommand;
    }

    public void move()
    {
        moveCommand.execute();
    }

    public void stop()
    {
        stopCommand.execute();
    }


}
