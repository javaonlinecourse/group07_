package com.javaonlinecourse.b4lesson3.classwork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class JavaTimeApi {
    public static void main(String[] args) throws ParseException {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        LocalDateTime tomorrowNoon = LocalDateTime.of(
                localDate.plusDays(1),
                LocalTime.NOON);

        Instant timestamp = Instant.now();
        LocalDateTime ldt = LocalDateTime.ofInstant(
                timestamp, ZoneId.systemDefault());

        LocalDate ld = LocalDate.now();
        ThaiBuddhistDate thaiBuddhistDate = ThaiBuddhistDate.from(ld);
        System.out.println(thaiBuddhistDate.toString());
    }
}
