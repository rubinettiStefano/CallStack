package com.generation.controller.nice;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.generation.exceptions.InvalidPropertyException;
import com.generation.model.Student;
import com.generation.model.Teacher;

//CONTERRÀ SOLAMENTE METODI DI UTILITÀ, DI COMODO, utilizzati nell'handler
public class Helper 
{
    static Scanner term = new Scanner(System.in);

    public static Teacher createFullTeacher()    
    {
        Teacher t = new Teacher();
        insertTeacherPropValue(t, "name");
        insertTeacherPropValue(t, "surname");
        insertTeacherPropValue(t, "subject");
        insertTeacherPropValue(t, "dob");

        return t;
    }

    public static Student createFullStudent()    
    {
        Student t = new Student();
        insertStudentPropValue(t, "name");
        insertStudentPropValue(t, "surname");
        insertStudentPropValue(t, "subject");
        insertStudentPropValue(t, "dob");

        return t;
    }

    public static void insertTeacherPropValue(Teacher t,String propName)
    {
        boolean correctExecution = false;
        do 
        {
            try
            {
                switch (propName) 
                {
                    case "id":
                        System.out.println("Inserisci "+propName);
                        t.setId(Integer.parseInt(term.nextLine()));
                    break;
                    case "name":
                        System.out.println("Inserisci "+propName);
                        t.setName(term.nextLine());
                    break;
                    case "surname":
                        System.out.println("Inserisci "+propName);
                        t.setSurname(term.nextLine());
                    break;
                    case "subject":
                        System.out.println("Inserisci "+propName);
                        t.setSubject(term.nextLine());
                    break;
                    case "dob":
                        System.out.println("Inserisci "+propName);
                        t.setDob(LocalDate.parse(term.nextLine()));
                    break;
                    default:
                        System.out.println("Il programmatore non sa scrivere bene le cose");
                        System.exit(-1);    
                }
                correctExecution = true;
            }
            catch(InvalidPropertyException e)
            {
                System.out.println(e.generateNiceMessage());
            }   
            catch(NumberFormatException e)
            {
                System.out.println("Non è un numero");
            }  
            catch(DateTimeParseException e)
            {
                System.out.println("Non hai inserito una data valida");
            }   

        } while (!correctExecution);

    }

    public static void insertStudentPropValue(Student t,String propName)
    {
        boolean correctExecution = false;
        do 
        {
            try
            {
                switch (propName) 
                {
                    case "id":
                        System.out.println("Inserisci "+propName);
                        t.setId(Integer.parseInt(term.nextLine()));
                    break;
                    case "name":
                        System.out.println("Inserisci "+propName);
                        t.setName(term.nextLine());
                    break;
                    case "surname":
                        System.out.println("Inserisci "+propName);
                        t.setSurname(term.nextLine());
                    break;
                    case "average":
                        System.out.println("Inserisci "+propName);
                        t.setAverage(Double.parseDouble(term.nextLine()));
                    break;
                    case "dob":
                        System.out.println("Inserisci "+propName);
                        t.setDob(LocalDate.parse(term.nextLine()));
                    break;
                    default:
                        System.out.println("Il programmatore non sa scrivere bene le cose");
                        System.exit(-1);    
                }
                correctExecution = true;
            }
            catch(InvalidPropertyException e)
            {
                System.out.println(e.generateNiceMessage());
            }   
            catch(NumberFormatException e)
            {
                System.out.println("Non è un numero");
            }  
            catch(DateTimeParseException e)
            {
                System.out.println("Non hai inserito una data valida");
            }   

        } while (!correctExecution);

    }


}
