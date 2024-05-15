package com.generation.controller;


import com.generation.acaso.En;

import ExceptionHandler.ExceptionLogger;

public class MainEs3 
{
     public static void main(String[] args) 
    {
        ExceptionLogger.startLogging();
        En o = new En();
        
        o.setA("a");
        o.setB("b");
        o.setC("c");
        o.setD("d");
        o.setE("e");
        o.setF("f");
        o.setG("g");
        o.setH("h");

        o.getA().equals("a");
        o.getB().equals("b");
        o.getC().equals("c");
        o.getD().equals("d");
        o.getE().equals("e");
        o.getF().equals("f");
        o.getG().equals("g");
        o.getH().equals("h");
    }

}
