package com.javaonlinecourse.b3lesson4.classwork;

/**
 * @author emitrohin
 * @version 1.0
 *          29.11.2016
 */
public enum Command {

    Create("db"),
    Update("bd"),
    Read("dc"),
    Delete("now");

    private String database;

    Command(String database) {
        this.database = database;
    }
}
