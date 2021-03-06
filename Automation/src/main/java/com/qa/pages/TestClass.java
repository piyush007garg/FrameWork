package com.qa.pages;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestClass
{
    public static void main(String args[] ) throws Exception 
    {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        
        Scanner s = new Scanner(System.in);
        
        int tc = s.nextInt();
        
        while(tc-->0)
        {
            
            enterNumber(s.nextInt());
             
        }
    }
    
public static void enterNumber(int finalNumber)
{
        for(int i = 1;i<=finalNumber;i++)
        {
            if((i%3==0)&& (i%5 == 0))
            {
                System.out.println("FizzBuzz");
            } else if(i%3 == 0)
            {
                System.out.println("Fizz");
            } else if(i%5==0)
            {
                System.out.println("Buzz");
            } else
            {
                System.out.println(i);
            }
        }
}

        // Write your code here
        
        
        
}
   

