package com.generation.controller;

import java.util.Scanner;

import ExceptionHandler.ExceptionLogger;

public class MainEsempio 
{
    public static void main(String[] args) 
    {
        //ExceptionLogger.startLogging();
        Scanner term = new Scanner(System.in);
        
        System.out.println("Inserisci un qualcosa");
        String input = term.nextLine();

        int risultato = metodino1(input);
        //parte uno STACK (PILA) di chiamate
        System.out.println(risultato);
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
}
