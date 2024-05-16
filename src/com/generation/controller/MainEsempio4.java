package com.generation.controller;

import java.util.Scanner;

import ExceptionHandler.ExceptionLogger;

public class MainEsempio4 
{
    public static void main(String[] args) 
    {
        ExceptionLogger.startLogging();
        Scanner term = new Scanner(System.in);

        boolean correctExecution = false;
        do 
        {
            try
            {
                System.out.println("Inserisci un qualcosa");
                String input = term.nextLine();
                int risultato = metodino1(input);
                System.out.println(risultato);
                correctExecution = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Non mi hai messo un numero, riprova");
            }    

        } while (correctExecution);

       
    }

    public static int metodino1(String input)
    {
        input+="2";//concatena 2
        
        int valoreMoltiplicato = metodino2(input);
        return valoreMoltiplicato;
    }

    public static int metodino2(String input)
    {
        int inputParsato = Integer.parseInt(input);
        inputParsato*=3;
        return inputParsato;
    }

    // public static int metodino2(String input)
    // {
    //     int inputParsato;
    //     try
    //     {
    //         //BLOCCO DI CODICE CALDO
    //         //CODICE che può GENERARE ECCEZIONE o a cui
    //         //può essere PROPAGATA un eccezione
    //         inputParsato = Integer.parseInt(input);
    //         inputParsato*=3;
    //     }
    //     catch(NumberFormatException e)
    //     {
    //         //CONTIENE IL CODICE DI GESTIONE DI UN ECCEZIONE DI UN DETERMINATO TIPO
    //         //codice da eseguire se tale eccezione viene catturata
    //         inputParsato = -1;
    //     }

        
    //     return inputParsato;
    // }
}
