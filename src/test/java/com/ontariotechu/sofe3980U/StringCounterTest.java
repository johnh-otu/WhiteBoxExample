package com.ontariotechu.sofe3980U;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.ontariotechu.sofe3980U.StringCounter;

public class StringCounterTest {
    
    private StringCounter strcount;

    @BeforeEach
    public void startTests()
    {
        strcount = new StringCounter();
    }

    //==========================BLACK BOX============================//

    
    //array
    @Test @Tag("blackbox") @Tag("array")
    public void arrayNoMatch()
    {
        char[] arr = {'a', 'b', 'c'};
        assertEquals( strcount.countOccurances(arr, 'd'), 0);
    }
    @Test @Tag("blackbox") @Tag("array")
    public void arrayOneMatch()
    {
        char[] arr = {'a', 'b', 'c'};
        assertEquals( strcount.countOccurances(arr, 'a'), 1);
    }
    @Test @Tag("blackbox") @Tag("array")
    public void arrayManyMatch()
    {
        char[] arr = {'a', 'a', 'a'};
        assertEquals( strcount.countOccurances(arr, 'a'), 3);
    }
    @Test @Tag("blackbox") @Tag("array")
    public void arrayEmpty()
    {
        char[] arr = {};
        assertEquals( strcount.countOccurances(arr, 'a'), 0);
    }

    //string
    @Test @Tag("blackbox") @Tag("string")
    public void stringNoMatch()
    {
        String str = "test";
        assertEquals( strcount.countOccurances(str, 'd'), 0);
    }
    @Test @Tag("blackbox") @Tag("string")
    public void stringOneMatch()
    {
        String str = "test";
        assertEquals( strcount.countOccurances(str, 'e'), 1);
    }
    @Test @Tag("blackbox") @Tag("string")
    public void stringManyMatch()
    {
        String str = "test";
        assertEquals( strcount.countOccurances(str, 't'), 2);
    }
    @Test @Tag("blackbox") @Tag("string")
    public void stringEmpty()
    {
        String str = "";
        assertEquals( strcount.countOccurances(str, 'd'), 0);
    }
    

    //==========================WHITE BOX============================//

    //array
    @ParameterizedTest @Tag("whitebox") @Tag("array")
    @ValueSource(strings = {"", "bb", "bb", ""})
    public void arrayWBNoMatch(String s)
    {
        assertEquals( strcount.countOccurances( s.toCharArray(), 'a' ), 0 );
    }

    @ParameterizedTest @Tag("whitebox") @Tag("array")
    @ValueSource(strings = {"a", "ba", "a", "ab", "a"})
    public void arrayWBOneMatch(String s)
    {
        assertEquals( strcount.countOccurances( s.toCharArray(), 'a' ), 1 );
    }

    @ParameterizedTest @Tag("whitebox") @Tag("array")
    @ValueSource(strings = {"aa"})
    public void arrayWBTwoMatch(String s)
    {
        assertEquals( strcount.countOccurances( s.toCharArray(), 'a' ), 2 );
    }

    
    //string
    @ParameterizedTest @Tag("whitebox") @Tag("array")
    @ValueSource(strings = {"", "bb", "bb", ""})
    public void stringWBNoMatch(String s)
    {
        assertEquals( strcount.countOccurances( s, 'a' ), 0 );
    }

    @ParameterizedTest @Tag("whitebox") @Tag("array")
    @ValueSource(strings = {"a", "ba", "a", "ab", "a"})
    public void stringWBOneMatch(String s)
    {
        assertEquals( strcount.countOccurances( s, 'a' ), 1 );
    }

    @ParameterizedTest @Tag("whitebox") @Tag("array")
    @ValueSource(strings = {"aa"})
    public void stringWBTwoMatch(String s)
    {
        assertEquals( strcount.countOccurances( s, 'a' ), 2 );
    }
    
}
