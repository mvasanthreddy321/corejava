package myprogram1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class sample26 {

	public static void main(String[] args) {
		Set obj=new TreeSet();
    	
   /*     obj.add(20);
		obj.add(11);
		obj.add(25);
		obj.add(10);
		obj.add(36);
		obj.add(29);
		obj.add(55);
		obj.add(85);
		obj.add(75);
		obj.add(66);
	*/
	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter values");
		
		for(int i=0;i<10;i++)
		{ 
			
			  obj.add(s1.nextInt());
		}
		
	
		Iterator i1=obj.iterator();
		while(i1.hasNext())
		{
			System.out.print(" "+i1.next());
		}
				
		
	}

}


/*
9.Write a program that will accept 10 numbers from the user as input and store it in a collection. 
The numbers should not be duplicated. Also get the index position along with the number where it has to be stored.
*/