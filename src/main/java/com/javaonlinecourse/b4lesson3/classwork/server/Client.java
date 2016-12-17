package com.javaonlinecourse.b4lesson3.classwork.server;

import org.omg.IOP.IOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Клиент запущен");

        int port = 4444;
        try(Socket server = new Socket("192.168.0.18", port)){
            try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedReader fromServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
                PrintWriter printWriter = new PrintWriter(server.getOutputStream(), true)){
                System.out.println("Отправьте сообщение:");
                String inMessage;
                while ( !(inMessage = bufferedReader.readLine()).equals("exit")){

                    printWriter.println(inMessage);
                    System.out.println(fromServer.readLine());
                }
                System.out.println("Вы вышли из клиента");
            }
        }catch (IOException e){
            System.out.println("Не удалось установить соединение");
        }
    }
}
