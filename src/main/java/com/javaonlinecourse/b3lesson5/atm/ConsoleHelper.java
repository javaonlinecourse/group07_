package com.javaonlinecourse.b3lesson5.atm;

import com.javaonlinecourse.b3lesson4.classwork.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author emitrohin
 * @version 1.0
 *          01.12.2016
 */
public class ConsoleHelper {

    private ConsoleHelper() {
    }

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String msg){
        System.out.println(msg);
    }

    public static String readString()
    {
        String s = "";

        try {
            s = reader.readLine();
        } catch (IOException e) {
            writeMessage("Ошибка ввода.");
        }

        return s;
    }

    public static String askCode()
    {
        String code;
        writeMessage("Пожалуйста, введите валюту.");
        while (true){
            code = readString();
            if ( code.length() == 3 )
                return code.toUpperCase();
            else
                writeMessage("Неправильно указан код валюты");
        }
    }

    public static int[] parseMoneyInput()
    {
        String[] array;
        int[] result = new int[2];
        writeMessage("Введите номинал и количество купюр через пробел");

        String input;
        while (true)
        {
            input = readString();
            array = input.split(" ");
            int x,y;
            try {
                x = Integer.parseInt(array[0]);
                y = Integer.parseInt(array[1]);
            } catch (NumberFormatException e){
                writeMessage("Некорректно введены данные");
                continue;
            }

            if (x > 0 || y > 0)
            {
                result[0] = x;
                result[1] = y;
                break;
            }
            else {
                writeMessage("Данные не могу быть отрицательными");
            }
        }
        return result;
    }

}
