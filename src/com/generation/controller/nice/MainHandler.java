package com.generation.controller.nice;

import java.util.Scanner;

import com.generation.model.Student;
import com.generation.model.Teacher;

//CONTERRÀ I SOTTOPROGRAMMA RICHIAMATI NEL MAIN e BASTA
public class MainHandler 
{
    static Scanner term = new Scanner(System.in);
    //view e repository

    public static void createTeacher() 
    {
        Teacher t = Helper.createFullTeacher();
      

        //qui ci sarebbe inserimento vero, ma ora semplicemente stampo
        System.out.println("Inserimento avvenuto con successo");
    }

    public static void createStudent() 
    {
        Student s = Helper.createFullStudent();
      

        //qui ci sarebbe inserimento vero, ma ora semplicemente stampo
        System.out.println("Inserimento avvenuto con successo");
    }
}
