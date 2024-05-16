package com.generation.controller;

import java.util.Scanner;

import com.generation.exceptions.InvalidPropertyException;
import com.generation.model.Person;

public class MainEsempio5 
{
    public static void main(String[] args) 
    {
        // Scanner term = new Scanner(System.in);

        // try 
        // {
        //     System.out.println("Inserisci valore, meglio se numero");
        //     String in = term.nextLine();  
        //     int a = Integer.parseInt(in);  //NumberFormatException

        //     System.out.println("hai inserito "+a);
        //     // String[] v = new String[2];
        //     // v[5] = "aaa";     //ArrayIndexOutOfBoudsException
        // } 
        // catch (RuntimeException e) 
        // {
        //     System.out.println("Ho catturato eccezione");
        // }

        //NumberFormatException è l'eccezione generata da Integer.parseInt quando non può convertire
        //Ma, in realtà, NumberFormatException È anche RuntimeException
        //NumberFormatException è una Classe che ESTENDE RuntimeException
        //è una SUA SPECIALIZZAZIONE

        Scanner term = new Scanner(System.in);

        try 
        {
            System.out.println("Inserisci numero");
            String in = term.nextLine();  

            Person p = new Person();
            p.setId(Integer.parseInt(in));

            System.out.println("Programma terminato senza eccezione");
        } 
        catch (InvalidPropertyException e) 
        {
            System.out.println(e.generateNiceMessage());
            e.printStackTrace();
        }
        catch(NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e)
        {
            System.out.println("Eccezione generica");
        }
    }
}
