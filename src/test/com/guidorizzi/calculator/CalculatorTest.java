package com.guidorizzi.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;


    //method to create only one instance
    //and give a hint to JVM garbageCollector
    //that this instance is eligible to be collected.
    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero(){
        int sum = calc.add(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canAddNegativeAndPositive(){
        int sum = calc.add(-10,2);
        assertEquals(-8, sum, "Was Expecting sum of -2");
    }

    @Test
     //or @Ignore
    public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, "0.06", 1);
        assertEquals("$184,664.43", answer);
    }

    public void annuityPractice() {
        String answer = calc.calcAnnuity("1200", 10, "0.08", 4);
        assertEquals("$72,482.38", answer);
    }





}



