package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression regularExpression;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.regularExpression= new RegularExpression();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        regularExpression = null;
    }

    @Test
    public void givenAStringShouldReturnBooleanValue(){
        String s="This is Harry";
        boolean result=regularExpression.regularExp(s);
        assertEquals(true,result);
    }
    @Test
    public void givenStringShouldReturnBooleanValue(){
        String s="This is Henry";
        boolean result=regularExpression.regularExp(s);
        assertEquals(false,result);
    }
}