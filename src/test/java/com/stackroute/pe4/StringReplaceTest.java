package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest {
    StringReplace stringReplace;

    @Before
    public void setup() {
        //This method runs, before running an of the testcase
        //This method is used to initialize the required variables

        this.stringReplace = new StringReplace();
    }

    @After
    public void tearDown() {
        //This method runs,after running all the testcases
        //This method is used to clear the initialized variables

        stringReplace = null;
    }

    @Test
    public void givenAStringShouldReplaceAllItsCharacters() {
        String s = "daily dry";
        String result = stringReplace.replace(s);
        assertEquals("faity fry", result);
    }

    @Test
    public void givenAStringShouldReplaceItsCharacterWithAnotherCharacter() {
        String s = "delhi";
        String result = stringReplace.replace(s);
        assertEquals("fethi", result);
    }

    @Test
    public void givenAnEmptyStringShouldReturnNull() {

        String res = stringReplace.replace("");
        assertEquals(null, res);


    }
}