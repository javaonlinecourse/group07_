package com.javaonlinecourse.b4lesson;

import java.io.*;

/**
 * @author emitrohin
 * @version 1.0
 *          13.12.2016
 */
public class InOut {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write("Java 8");
        bufferedWriter.write(" is cool");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        PrintWriter printWriter = new PrintWriter(System.out, true);

        printWriter.println("jhjhj");
    }
}
