package com.generation.controller;

import java.util.Scanner;

import ExceptionHandler.ExceptionLogger;

public class MainEsempio2 
{
    public static void main(String[] args) 
    {
        //faccio un semplice programma per determinare il prezzo di un telefono in base alla sua memoria 
         ExceptionLogger.startLogging();
        Scanner term = new Scanner(System.in);
        System.out.println("Inserisci memoria telefono");
        int mem = Integer.parseInt(term.nextLine());
        int prezzoTelefono = 100 + moltiplicatoreMemoria(mem);

        System.out.println("Il prezzo è "+prezzoTelefono);
    }

    public static int moltiplicatoreMemoria(int mem)
    {
        if(mem<=0)  
            throw new RuntimeException("La memoria deve essere positiva, tu invece mi hai passato: "+mem);//risolvi il metodo con questa eccezione

        return mem*3;
    }
}
