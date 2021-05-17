package com.example.springdocker.model;


public class MyMathCalc {

    public int add(int a, int b){
        return a+b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(double a, double b){
        if (b == 0) {
            throw new NumberFormatException("Could not divide with 0..");
        }
        return a/b;
    }
}


