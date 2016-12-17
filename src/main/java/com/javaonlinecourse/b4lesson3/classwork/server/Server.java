package com.javaonlinecourse.b4lesson3.classwork.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class Server {
    public static void main(String[] args) {
        int port = 4444;
        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Ожидаю подключение клиента");
            try(Socket client = serverSocket.accept()) {
                System.out.println("Клиент подключен");
                try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    PrintWriter printWriter = new PrintWriter(client.getOutputStream(), true)){
                    System.out.println("Ожидаем появление сообщения...");
                    String inMessage;
                    while ( (inMessage = bufferedReader.readLine()) != null){
                        System.out.println("От клиента: " + inMessage);
                        printWriter.println(serverSocket.getLocalSocketAddress() + " Соощение принято.");
                    }
                    System.out.println("Клиент вышел!");
                }
            }
        } catch (IOException e) {
            System.out.println("Невозможно создать сервеный сокет");
        }

    }
}
