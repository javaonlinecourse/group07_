package com.javaonlinecourse.b3lesson7.classwork.dao;

import java.util.List;

/**
 * @author emitrohin
 * @version 1.0
 *          08.12.2016
 */
public interface ProductAccessInterface {
    Product get();
    void delete(Product user);
    void update(Product user);
    Product create();
    List<Product> getAll();
}
