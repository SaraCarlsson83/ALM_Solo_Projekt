package com.example.springdocker.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyMathCalcTest {

    MyMathCalc myMathCalc;

    @BeforeEach
    void beforeEach(){
        myMathCalc = new MyMathCalc();
    }

    @Test
    void addTest() {
        double actual = myMathCalc.add(3,2);
        double expectedTrue = 5;
        double expectedFalse = 4;
        assertEquals(actual, expectedTrue);
        assertNotEquals(actual, expectedFalse);
    }

    @Test
    void multiplyTest() {
        double actual = myMathCalc.multiply(3,2);
        double expectedTrue = 6;
        double expectedFalse = 4;

        assertEquals(actual, expectedTrue);
        assertNotEquals(actual, expectedFalse);
    }

    @Test
    void divideTest() {
        double actual = myMathCalc.divide(5,2);
        double expectedTrue = 2.5;
        double expectedFalse = 4;
        assertEquals(actual, expectedTrue);
        assertNotEquals(actual, expectedFalse);
    }

    @Test
    void divideWithZeroTest(){
        assertThrows(NumberFormatException.class , () -> myMathCalc.divide(5, 0));
    }
}