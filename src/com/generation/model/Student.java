package com.generation.model;

import com.generation.exceptions.InvalidPropertyException;

public class Student extends Person 
{

    private Double average;//media dei voti
    

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) 
    {
        if( average==null || average<=0)
            throw new InvalidPropertyException("Brutto brutto","average","student");
        this.average = average;
    }

    

}
