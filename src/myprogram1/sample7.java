package myprogram1;

import java.util.Scanner;

public class sample7 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		double total=0;
		while(true)
		{
			System.out.println("1 - product 1,22.50");
			System.out.println("2 - product 2,44.50");
			System.out.println("3 - product 3,9.98");
			System.out.println("4 - Exit");
			System.out.println(" Enter product number");
			int productnumber=s1.nextInt();
			
			if(productnumber==4)
			{ 
				break;
			}
			
			System.out.println(" Enter quantity number");
			int quantitysold =s1.nextInt();
			
			switch(productnumber)
			{
			   case 1 :  total+=2.98*quantitysold; break;
			   case 2 :  total+=44.50*quantitysold; break;
			   case 3 :  total+=9.98*quantitysold; break;
				           	
			}
			
			System.out.println(" Display Total  : "+total);
		}
		

	}

}
/*
9.A shopkeeper sells three products whose retail prices are as follows: 
Product 1 - 22.50
              Product 2 - 44.50 
              Product 3 - 9.98
Write an application that reads a series of pairs of numbers as follows:
 a) Product number 
 b) Quantity sold

                The application should use a switch statement to determine the retail price for each product. It 
should calculate and display the total retail value of all products sold. 
*/