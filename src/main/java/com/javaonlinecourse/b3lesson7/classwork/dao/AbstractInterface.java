package com.javaonlinecourse.b3lesson7.classwork.dao;

import java.util.List;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public interface AbstractInterface<T> {
    T get();
    void delete(T item);
    void update(T item);
    T create();
    List<T> getAll();
}
