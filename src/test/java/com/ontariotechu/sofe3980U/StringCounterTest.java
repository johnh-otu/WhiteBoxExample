package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ontariotechu.sofe3980U.StringCounter;

public class StringCounterTest {
    
    private StringCounter strcount;

    @BeforeAll
    public void startTests()
    {
        strcount = new StringCounterTest();
    }

    @Test
    public void arrayNoMatch()
    {
        char[] arr = {'a', 'b', 'c'};
        assertEquals( strcount.countOccurances(arr, 'd'), 0);
    }
    @Test
    public void arrayOneMatch()
    {
        char[] arr = {'a', 'b', 'c'};
        assertEquals( strcount.countOccurances(arr, 'a'), 1);
    }
    @Test
    public void arrayManyMatch()
    {
        char[] arr = {'a', 'a', 'a'};
        assertEquals( strcount.countOccurances(arr, 'a'), 3);
    }
    @Test
    public void arrayEmpty()
    {
        char[] arr = {};
        assertEquals( strcount.countOccurances(arr, 'a'), 0);
    }

    @Test
    public void stringNoMatch()
    {
        String str = "test";
        assertEquals( strcount.countOccurances(str, 'd'), 0);
    }
    @Test
    public void stringOneMatch()
    {
        String str = "test";
        assertEquals( strcount.countOccurances(str, 'e'), 1);
    }
    @Test
    public void stringManyMatch()
    {
        String str = "test";
        assertEquals( strcount.countOccurances(str, 't'), 2);
    }
    @Test
    public void stringEmpty()
    {
        String str = "";
        assertEquals( strcount.countOccurances(str, 'd'), 0);
    }
}
