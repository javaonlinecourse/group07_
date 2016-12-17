package com.javaonlinecourse.b4lesson3.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class HttpConnection {
    public static void main(String[] args) throws IOException {
        URL g = new URL ("http://www.google.ru:80/intl/ru/about/products/");

        System.out.println("Пpoтoкoл: " + g.getProtocol());
        System.out.println("Пopт: " + g.getPort());
        System.out.println("Xocт: " + g.getHost());
        System.out.println("Фaйл: " + g.getFile());
        System.out.println("Пoлнaя форма: " + g.toExternalForm());
        System.out.println();

        HttpURLConnection con = (HttpURLConnection) g.openConnection();
        System.out.println(con.getContentType());
        System.out.println(con.getRequestMethod());

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            while (in.ready()) {
                System.out.println(in.readLine());
            }
        }
    }
}
