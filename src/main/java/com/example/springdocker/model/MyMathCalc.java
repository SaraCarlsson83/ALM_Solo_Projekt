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

    public static void main(String[] args) {
        MyMathCalc m = new MyMathCalc();
        m.divide(5, 0);

        System.out.println(m.divide(9,0));

    }
}


