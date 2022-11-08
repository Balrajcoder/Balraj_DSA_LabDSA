package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class BalancedBracket
{
    public static void main( String[] args )
    {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the bracket string");
        String brackets= input.next();
        CheckBalancedString check =new CheckBalancedString();
        boolean ch=check.checkBalancedString(brackets,brackets.length());
        if(ch)
        {
            System.out.println("The Entered strings has balanced brackets");
        }
        else {
            System.out.println("The Entered strings do not contain balanced brackets");

        }


    }
}
