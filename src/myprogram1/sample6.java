package myprogram1;

import java.util.Scanner;

public class sample6 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println(" enter no.of classes held ");
		float held=s1.nextFloat();
		
		System.out.println(" enter no.of classes attended");
		float attended=s1.nextFloat();
		 
		float attendance;
		attendance=((attended)/held)*100;
		System.out.println(" Attendance is "+attendance);
		
		System.out.println(" enter he/she has medical cause");
		String reason=s1.next();
		//System.out.println(reason);
		
		
		if(attendance > 70.0)
		{
			System.out.println(" He/she allowed to sit in the exam");
			
		}
		else if(attendance <70.0 && reason.equals("yes"))
		{
			System.out.println(" He/she allowed to sit in the exam");
		}
		
		else 
			
			System.out.println(" He/she not allowed to sit in the exam");
		
		
		
	}
	}


/*
7.A student will not be allowed to sit in exam if his/her attendence is less than 70%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

8.Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/