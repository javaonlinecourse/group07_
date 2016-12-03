package com.javaonlinecourse.b3lesson5.atm.command;

import com.javaonlinecourse.b3lesson5.atm.exception.InterrupedOperationException;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
interface Command {
    void execute() throws InterrupedOperationException;
}
