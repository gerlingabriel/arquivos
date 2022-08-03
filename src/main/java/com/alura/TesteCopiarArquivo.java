package com.alura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class TesteCopiarArquivo 
{
    public static void main( String[] args ) throws IOException{

        Socket s = new Socket();

        FileInputStream fis = (FileInputStream) s.getInputStream(); //(FileInputStream) System.in;// new FileInputStream("texto");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = s.getOutputStream(); //System.out;//new FileOutputStream("texto2");
        Writer w = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(w);

        String linha = br.readLine();

        while(linha != null){
            bw.write(linha);
            bw.newLine();
            bw.flush(); // liberar a saída logo
            linha = br.readLine();
        }
        br.close();
        bw.close(); 
        
    }
}
