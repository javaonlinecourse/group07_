package com.javaonlinecourse.b3lesson5.commandpattern.commands;

import com.javaonlinecourse.b3lesson5.commandpattern.interfaces.Stoppable;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
public class StopCommand implements Command{

    private Stoppable stoppable;

    public StopCommand(Stoppable stoppable) {
        this.stoppable = stoppable;
    }

    @Override
    public void execute() {
        stoppable.stop();
    }
}
