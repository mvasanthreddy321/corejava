package myprogram1;

import java.util.Scanner;

public class sample13 {

	public static void main(String[] args) {
		int marks[]=new int[3];
		double total=0;
		
		Scanner s1=new Scanner(System.in);
		
		for(int i=0;i<marks.length;i++)
		{ 
			System.out.println(" enter the marks for student "+(i+1));
			marks[i]=s1.nextInt();
			if(marks[i]>=0 && marks[i]<100)
			{
				//for( int j=0;j<marks.length;j++)
				
					total=total+marks[i];
				
			}
			else
			 {
				System.out.println("Invalid input try again");
				i--;
			 }
			
				
			}
			
		
		System.out.println(total);
			
		double average=(total)/3;
		
		System.out.println((double)Math.round(average*100)/100);
		 }
		

	}



/* Write a program that prompts user for the mark (between 0-100 in int) of 3 students; computes the average (in double); and prints the result rounded to 2 decimal places. Your program needs to perform input validation. For examples,

Enter the mark (0-100) for student 1: 56
Enter the mark (0-100) for student 2: 101
Invalid input, try again...
Enter the mark (0-100) for student 2: -1
Invalid input, try again...
Enter the mark (0-100) for student 2: 99
Enter the mark (0-100) for student 3: 45
The average is: 66.67 */