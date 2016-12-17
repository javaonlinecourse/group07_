package com.javaonlinecourse.b4lesson3.classwork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;


/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class Calendars {
    public static void main(String[] args) throws ParseException {
        TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");

        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles"));

        System.out.println("hour = " + calendar.get(Calendar.HOUR_OF_DAY) + " day = " + calendar.get(Calendar.DAY_OF_MONTH));
        calendar.setTimeZone(timeZone1);
        System.out.println("hour = " + calendar.get(Calendar.HOUR_OF_DAY) + " day = " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println(new GregorianCalendar(1600, 2, 2).getTime().toString());

        String dateString = "2015/05/02";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = dateFormat.parse(dateString);
        System.out.println(date.toString());
    }
}
