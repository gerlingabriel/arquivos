package com.alura;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Hello world!
 *
 */
public class TesteEscrita3
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

        // BufferedWriter bw = new BufferedWriter(new FileWriter("texto2"));

        // PrintStream ps = new PrintStream("texto2");
        PrintWriter ps = new PrintWriter("texto2");

        ps.println("teste01");
        ps.println();
        ps.println("teste02");

        ps.close();
        
    }
}
