package myprogram1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sample24 {

	public static void main(String[] args) {
		String str = "Hello how are you";
		try
		{
			System.out.println(str.charAt(40));
		}
		catch(StringIndexOutOfBoundsException e)
		{
		    System.out.println("ERROR IS :::"+e);
		    //e.printStackTrace();
		}
		
		Scanner s1 = new Scanner(System.in);
        try {
           System.out.println("Enter Integer Value: ");
           Integer inputInt = s1.nextInt(); // input : "1.1"  
           System.out.println(inputInt);

        } 
        catch (InputMismatchException ex) {
           System.out.println("We have given input as float expecting integer "+ ex);
        }
	}

}


/*
4. Write a program to demonstrate the InputMismatchException and StringIndexOutOfBoundsException.
*/