package com.javaonlinecourse.b4lesson;

import java.io.*;

/**
 * @author emitrohin
 * @version 1.0
 *          13.12.2016
 */
public class Fileoutput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/temp.txt");

        while (fis.available() > 0){
            System.out.print((char) fis.read());
        }

        BufferedWriter bf = new BufferedWriter(new FileWriter("D:/temp.txt", true));
        bf.newLine();
        bf.write("HeyHo!");
        bf.newLine();
        bf.write("happy Christmas!");
        bf.newLine();
        bf.flush();
        bf.close();


    }
}
