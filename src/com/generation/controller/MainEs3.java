package com.generation.controller;


import com.generation.acaso.En;

import ExceptionHandler.ExceptionLogger;

public class MainEs3 
{

    public static void main(String[] args) {
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
        checkA(o);
        checkB(o);
        checkC(o);
        checkD(o);
        checkE(o);
        checkF(o);
        checkG(o);
        checkH(o);
    }

    public static void checkA(En o) {
        if (o.getA().equals("a")) {
            System.out.println("A is correct");
        } else {
            System.out.println("A is incorrect");
        }
    }

    public static void checkB(En o) {
        if (o.getB().equals("b")) {
            System.out.println("B is correct");
        } else {
            System.out.println("B is incorrect");
        }
    }

    public static void checkC(En o) {
        if (o.getC().equals("c")) {
            System.out.println("C is correct");
        } else {
            System.out.println("C is incorrect");
        }
    }

    public static void checkD(En o) {
        if (o.getD().equals("d")) {
            System.out.println("D is correct");
        } else {
            System.out.println("D is incorrect");
        }
    }

    public static void checkE(En o) {
        if (o.getE().equals("e")) {
            System.out.println("E is correct");
        } else {
            System.out.println("E is incorrect");
        }
    }

    public static void checkF(En o) {
        if (o.getF().equals("f")) {
            System.out.println("F is correct");
        } else {
            System.out.println("F is incorrect");
        }
    }

    public static void checkG(En o) {
        if (o.getG().equals("g")) {
            System.out.println("G is correct");
        } else {
            System.out.println("G is incorrect");
        }
    }

    public static void checkH(En o) {
        if (o.getH().equals("h")) {
            System.out.println("H is correct");
        } else {
            System.out.println("H is incorrect");
        }
    }
    


}
