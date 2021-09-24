package myprogram1;
import static java.lang.System.*;
import java.util.Scanner;

 class hall
{  
	 static void test()
   {
	  out.println(" This is the first room while entering the house");
	}
}
 

public class sample21 {

	public static void main(String[] args) {
		
       hall.test();
       int arr[]=new int[10];
       Scanner s1=new Scanner(System.in);
       System.out.println("enter the values");
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=s1.nextInt();
       }
       
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
       int arr1[]=new int[10];
       for(int i=0;i<arr1.length;i++)
       {
    	   arr1[i]=arr[i];
       }
       System.out.println("\ncopied");
       
       for(int i=0;i<arr1.length;i++)
       {
    	   System.out.print( arr1[i]+" ");
       }
        
	}

}
/*
	1.Create a Package called house. Create 2 classes namely Hall and Kitchen.

	a.  In the Hall class print the message “This is the first room while entering the house” without using the class name System explicitly in the println statement.
	b. In the Kitchen class create an array called appliances and initialize with values and print the same. 
	c. After printing copy that array into a different array.
	*/