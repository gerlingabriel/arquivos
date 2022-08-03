package com.alura;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Hello world!
 *
 */
public class TesteEscrita 
{
    public static void main( String[] args ) throws IOException{

        OutputStream fos = new FileOutputStream("texto2");
        Writer w = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(w);

        bw.write("teste 01");
        bw.newLine();
        bw.newLine();
        bw.write("teste02");

        bw.close();
        
    }
}
