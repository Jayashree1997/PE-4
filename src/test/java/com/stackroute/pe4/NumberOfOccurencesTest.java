package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class NumberOfOccurencesTest {
    NumberOfOccurences numberOfOccurences;
    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.numberOfOccurences= new NumberOfOccurences();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        numberOfOccurences = null;
    }
    @Test
    public void givenStringShouldReturnCountOfOccurencesOfACharacter(){
        String s="java is easy";
        int result=numberOfOccurences.countCharacters(s);
        assertEquals(3,result);
    }
    @Test
    public void givenStrShouldReturnCountOfOccurencesOfACharacter(){
        String s="Health is wealth";
        int result=numberOfOccurences.countCharacters(s);
        assertEquals(2,result);
    }
}