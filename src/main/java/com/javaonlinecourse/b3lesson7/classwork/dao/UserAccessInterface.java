package com.javaonlinecourse.b3lesson7.classwork.dao;

import java.util.List;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public interface UserAccessInterface {
    User get();
    void delete(User user);
    void update(User user);
    User create();
    List<User> getAll();
}
