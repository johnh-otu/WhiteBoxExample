package com.ontariotechu.sofe3980U;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringCounter strcount = new StringCounter();
        
        char[] array = {'a', 'b', 'c', 'a', 'd', 'a', 'd', 'r'};
        String string = "hello world";
        char carr = 'a';
        char cstr = 'l';

        int countarr = strcount.countOccurances(array, carr);
        int countstr = strcount.countOccurances(string, cstr);

        System.out.println("The character " + carr + " appears " + countarr + " times in the array.");
        System.out.println("The character " + cstr + " appears " + countstr + " times in the string \"" + string + "\".");
    }
}
