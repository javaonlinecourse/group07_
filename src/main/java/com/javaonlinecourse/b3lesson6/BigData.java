package com.javaonlinecourse.b3lesson6;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author emitrohin
 * @version 1.0
 *          06.12.2016
 */
public class BigData {
    public static void main(String[] args) {
        BigInteger i = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(i);
        System.out.println(i.add(BigInteger.valueOf(Long.MAX_VALUE)));

        BigDecimal b = BigDecimal.valueOf(1D/3);
        System.out.println(b);
    }
}
