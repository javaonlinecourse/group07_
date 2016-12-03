package com.javaonlinecourse.b3lesson5.commandpattern.commands;

import com.javaonlinecourse.b3lesson5.commandpattern.interfaces.Movable;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
public class MoveCommand implements Command{

    private Movable movable;

    public MoveCommand(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void execute() {
        movable.move();
    }
}
