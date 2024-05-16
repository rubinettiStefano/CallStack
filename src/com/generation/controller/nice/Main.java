package com.generation.controller.nice;

import java.util.Scanner;

//SI OCCUPA UNICAMENTE DI CHIEDERE ALL'UTENTE QUALE SOTTOPROGRAMMA VUOLE ESEGUIRE E DI FARLO PARTIRE
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner term = new Scanner(System.in);
        
        String cmd;

        do 
        {
            
            System.out.println("Inserici comando");
            cmd = term.nextLine().toLowerCase();

            switch (cmd) 
            {
                case "createteacher":
                    MainHandler.createTeacher();
                break;
                case "createstudent":
                    MainHandler.createStudent();
                break;
                case "quit":
                    System.out.println("BYE BYE");
                break;
                default:
                    System.out.println("Comando non riconosciuto");
                break;
            }

        } while (!cmd.equals("quit"));
    }
}
