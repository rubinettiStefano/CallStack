package com.generation.model;

public class Person 
{
    private Integer id;
    private String name,surname;
    
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
            throw new NumberFormatException("Id brutto "+id+" , non lo voglio cambiare");

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isBlank() )
            throw new RuntimeException("name brutto "+name+" , non lo voglio cambiare");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if( surname==null || surname.isBlank())
            throw new RuntimeException("surname brutto "+surname+" , non lo voglio cambiare");
        this.surname = surname;
    }

    
}
