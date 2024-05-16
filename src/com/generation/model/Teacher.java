package com.generation.model;


//Teacher diventa SOTTOTIPO
//SPECIALIZZAZIONE
//ESTENSIONE
//di Person

//Teacher non parte come CLASSE VUOTA
//MA PARTE da Person
public class Teacher extends Person
{
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

   

    
}
