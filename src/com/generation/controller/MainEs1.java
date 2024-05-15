package com.generation.controller;

import ExceptionHandler.ExceptionLogger;

public class MainEs1 
{
    public static void main(String[] args) 
    {
        ExceptionLogger.startLogging();
        System.out.println(a().split(",")[1].equals("6"));    
    }

    private static String a()
    {
        return "2"+4;
    }
}
