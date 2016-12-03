package com.javaonlinecourse.b3lesson5.commandpattern;

import com.javaonlinecourse.b3lesson5.commandpattern.interfaces.Movable;
import com.javaonlinecourse.b3lesson5.commandpattern.interfaces.Stoppable;

/**
 * @author emitrohin
 * @version 1.0
 *          03.12.2016
 */
public class Roach implements Movable, Stoppable {

    @Override
    public void move(){
        System.out.println("Roach is moving!");
    }

    @Override
    public void stop(){
        System.out.println("Roach has stopped!");
    }

}
