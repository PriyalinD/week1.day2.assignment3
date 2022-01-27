package week1.day2.assignment3;

import java.util.Arrays;

public class ReverseEvenWords {
	public static void main (String arg[])
	{
	String str="I am a Software Tester";
    
    String[] split = str.split(" ");
    System.out.println(Arrays.toString(split));
    
    for(int i=0;i<split.length;i++)
    {
        if(i%2!=0) 
        {
            char[] charArray = split[i].toCharArray();
            
           for(int j=charArray.length-1;j>=0;j--)
           {
                System.out.print(charArray[j]);
            }
            System.out.print(" ");
        }else {
            System.out.print(split[i] +" ");
        }
    }
}
}
    
    
    
    

