package com.example.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClassTest {

    private static int x;
    private static int y;


    @BeforeAll
    private static void initParams() {
        System.out.println("Start");
       x = 1;
       y = 2;
        testClass = new TestClass();
    }
    static TestClass testClass;
    @Test
    void getSum(){
        Assertions.assertEquals(3,testClass.getSum(x,y));
    }


}