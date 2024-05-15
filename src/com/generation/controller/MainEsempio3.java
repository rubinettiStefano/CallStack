package com.generation.controller;

import com.generation.model.Person;

import ExceptionHandler.ExceptionLogger;

public class MainEsempio3 
{
    public static void main(String[] args) 
    {
        ExceptionLogger.startLogging();
        
        Person p  = new Person(10, "Stefano", "Rubinetti");

        p.setId(-50);
    }
}
