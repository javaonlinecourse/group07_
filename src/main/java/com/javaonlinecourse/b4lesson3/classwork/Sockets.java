package com.javaonlinecourse.b4lesson3.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author emitrohin
 * @version 1.0
 *          17.12.2016
 */
public class Sockets {
    public static void main(String[] args) throws UnknownHostException {
        try (Socket s = new Socket(InetAddress.getByName("www.google.ru"), 80)) {
            try (PrintWriter out = new PrintWriter(s.getOutputStream())) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
                    out.println("GET / HTTP/1.1");
                    out.println();
                    out.flush();
                    String line;
                    int length = 0;
                    do {
                        System.out.println(line = in.readLine());
                        if (line.startsWith("Content-Length: ")) {
                            length = Integer.parseInt(line.substring(16));
                        }
                    } while (!line.isEmpty());
                    char[] buf = new char[length];
                    in.read(buf);
                    System.out.println(new String(buf));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
