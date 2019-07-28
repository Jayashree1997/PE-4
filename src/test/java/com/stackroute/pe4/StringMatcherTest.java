package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {

    StringMatcher ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new StringMatcher();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void givenATextAndItsSubstringShouldReturnItsOccurence() {

        String res = ob.findOccurence("She sells seashells by the seashore", "se");
        assertEquals("Found at: 4 - 6\nFound at: 10 - 12\nFound at: 27 - 29\n", res);

    }

    @Test
    public void givenNullStringShouldReturnNull() {

        String res = ob.findOccurence("", "");
        assertEquals(null, res);

    }

}