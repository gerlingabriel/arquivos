package com.alura;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class TesteLeitura2
{
    public static void main( String[] args ) throws IOException{

        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

        Locale BRAZIL = new Locale("pt_BR");

        while(scanner.hasNext()){

            String nextLine = scanner.nextLine();
            // System.out.println(nextLine);

            // String[] atributos = nextLine.split(",");

            Scanner linhaScanner = new Scanner(nextLine);
            linhaScanner.useLocale(BRAZIL); // ao usar Locale no format esse useLocale ficou obrigaorio
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            Integer agencia = linhaScanner.nextInt();
            Integer numeroConta = linhaScanner.nextInt();
            String nomeCliente = linhaScanner.next();
            Double saldo = linhaScanner.nextDouble();

            String format = String.format(new Locale("pt", "BR"),"%s %d-%d %s: R$%.2f", tipoConta, agencia, numeroConta, nomeCliente, saldo);
            System.out.println(format);

            linhaScanner.close();   
        }

        scanner.close();
        
    }
}
