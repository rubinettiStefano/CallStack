package com.generation.controller;


import com.generation.acaso.Aaaa;

import ExceptionHandler.ExceptionLogger;

public class MainEs2 
{
    public static void main(String[] args) 
    {
        ExceptionLogger.startLogging();
        Aaaa s = new Aaaa();
        System.out.println(m(s));    
    }

    private static String m(Aaaa s)
    {
        return "Deve uscire 4 :"+(s.m1d());
    }
}
