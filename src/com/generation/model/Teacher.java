package com.generation.model;

import com.generation.exceptions.InvalidPropertyException;

//Teacher diventa SOTTOTIPO
//SPECIALIZZAZIONE
//ESTENSIONE
//di Person

//Teacher non parte come CLASSE VUOTA
//MA PARTE da Person
public class Teacher extends Person
{
    private String subject;

    public String getSubject() 
    {
        return subject;
    }

    public void setSubject(String subject) 
    {
        if( subject==null || subject.isBlank())
            throw new InvalidPropertyException("Brutto brutto","subject","Teacher");
        this.subject = subject;
    }

   

    
}
