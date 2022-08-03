package com.alura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class TesteEscrita2 
{
    public static void main( String[] args ) throws IOException{

        // OutputStream fos = new FileOutputStream("texto2");
        // Writer w = new OutputStreamWriter(fos);
        // BufferedWriter bw = new BufferedWriter(w);

        // FileWriter fileWriter = new FileWriter("texto2");

        // fileWriter.write("teste 01");
        // fileWriter.write(System.lineSeparator());
        // fileWriter.write(System.lineSeparator());
        // fileWriter.write("teste02");

        // fileWriter.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("texto2"));

        bw.write("teste 01");
        bw.newLine();
        bw.newLine();
        bw.write("teste02");

        bw.close();
        
    }
}
