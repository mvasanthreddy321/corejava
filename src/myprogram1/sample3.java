package myprogram1;

import java.util.Scanner;

public class sample3 {

	public static void main(String[] args) {
		Scanner s1=new Scanner (System.in);
		
		
		System.out.println(" enter name");
		String name=s1.nextLine();
		
		System.out.println(" enter roll number");
		int roll=s1.nextInt();
		
		s1.nextLine();
		System.out.println("enter field of interest");
		String field =s1.nextLine();
		
		
		
	 System.out.println(" Hey, my name is "+name +" "+" and my roll number is "+roll+" "+". My field of interest are "+field);

	}

}


//Take name, roll number and field of interest from user and print in the format below :
//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
