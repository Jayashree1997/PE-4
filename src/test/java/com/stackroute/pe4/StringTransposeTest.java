package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.stringTranspose= new StringTranspose();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        stringTranspose = null;
    }


    @Test
    public void givenAStringShouldReturnItsTranspose(){
        String s="java is easy";
        String result=stringTranspose.transpose(s);
        assertEquals("ysae si avaj",result);
    }
    @Test
    public void givenAStringShouldReturnTheTranspose(){
        String s="World Trade Center";
        String result=stringTranspose.transpose(s);
        assertEquals("retneC edarT dlroW",result);
    }

}