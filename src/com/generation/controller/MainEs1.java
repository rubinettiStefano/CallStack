package com.generation.controller;

import java.util.Arrays;

import ExceptionHandler.ExceptionLogger;

public class MainEs1 
{
    public static void main(String[] args) 
    {
        ExceptionLogger.startLogging();
        System.out.println(Arrays.asList(a().split(",")).get(1).equals("6"));    
    }

    private static String a()
    {
        return "2"+4;
    }
}
