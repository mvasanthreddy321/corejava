package myprogram1;

import java.util.Scanner;

public class sample4 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println(" Enter salary ");
		int salary=s1.nextInt();
		System.out.println(" Enter service ");
		int service=s1.nextInt();
		
		float profit;
		if(service>6)
		{
			profit=(0.1f)*salary + salary;
			System.out.println(" new salary"+profit);
		}
		else
		System.out.println(" not eligible for bonus");
		

	}

}


/*A company decided to give bonus of 10% to employee if his/her year of service is more than 6 years.
Ask user for their salary and year of service and print the net bonus amount. */