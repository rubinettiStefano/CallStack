package com.generation.model;

import java.time.LocalDate;

import com.generation.exceptions.InvalidPropertyException;

public class Person 
{
    private Integer id;
    private String name,surname;
    private LocalDate dob;//dateOfBirth

    public Person(){}

    public Person(Integer id, String name, String surname) 
    {

        if(id==null || id<=0 || name==null || name.isBlank() || surname==null || surname.isBlank() )
        {
            RuntimeException err = new RuntimeException("I dati per creare la persona sono indegni, mi rifiuto");
            throw err;
        }
            
        
        this.id = id;
        this.name = name;
        this.surname = surname;


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id==null || id<=0 )
            throw new InvalidPropertyException("Brutto brutto","id","Person");

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isBlank() )
            throw new InvalidPropertyException("Brutto brutto","name","Person");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if( surname==null || surname.isBlank())
            throw new InvalidPropertyException("Brutto brutto","surname","Person");
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    
}
