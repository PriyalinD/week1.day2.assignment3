package week1.day2.assignment3;

import java.util.Arrays;

public class Anagram 
{
    public static void main (String [] args)
    {  
    String text1="stops";  
    String text2="potss";  
     //Check length of the strings  
    if (text1.length() !=text2.length()) 
    {  
        System.out.println("Both the strings are not anagram");  
    }  
    else {  
        // Convert both Strings in to characters
        char[] string1 = text1.toCharArray();  
        char[] string2 = text2.toCharArray();  

        //Sort Both the arrays
        Arrays.sort(string1);  
        Arrays.sort(string2);  

        //Check both the arrays has same value  
        if(Arrays.equals(string1, string2) == true) 
        {  
            System.out.println("Both the strings are anagram");  
        }  
        else {  
            System.out.println("Both the strings are not anagram");  
        }  
    }  
}  
}   
