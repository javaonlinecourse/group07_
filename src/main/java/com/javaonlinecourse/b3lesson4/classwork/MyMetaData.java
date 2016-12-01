package com.javaonlinecourse.b3lesson4.classwork;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={METHOD})
public @interface MyMetaData {
    String value();
    int integer();
}
