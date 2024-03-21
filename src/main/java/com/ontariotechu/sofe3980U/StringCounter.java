package com.ontariotechu.sofe3980U;

public class StringCounter 
{
    public int countOccurances(char[] array, char character)
    {
        int count = 0;
        
        for (char c : array) {
            if (c == character)
                count++;
        }
        
        return count;
    }
    public int countOccurances(String string, char character)
    {
        int count = 0;
        int strlen = string.length();

        for (int i = 0; i < strlen; i++) {
            if (string.charAt(i) == character)
                count++;
        }
        
        return count;
    }
}
