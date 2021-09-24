package myprogram1;

public class sample25 {

	public static void main(String[] args) {
		
     
	try {
		      int a3=12/1;
		      System.out.println(a3);
			
		try { String str1="vasanth";
		     System.out.println(str1.length());
		
		try {
		       String str="hello welcome to java";
		       System.out.println(str.charAt(7));
		
	try {
		       int a1[] = new int[5];
		       a1[1]=10;
		       System.out.println(a1[1]);
		
	  try
		   {
			int a[]=new int[1];
		   }
	catch(NegativeArraySizeException e)
		{
			System.out.println("catch1 is executed");
             e.printStackTrace();
		}
		
		finally
		  {
			System.out.println("finally1 is executed" );
		  }

		}
	catch(ArrayIndexOutOfBoundsException e)
		{ System.out.println("catch2 is executed");}
	finally
		{System.out.println("finally2 is executed");}

		}
	catch(StringIndexOutOfBoundsException e)
		{ System.out.println("catch3 is executed");}
		
	finally
		{System.out.println("finally3 is executed");}
		
		}
	catch(NullPointerException e)
		  { System.out.println("catch4 is executed");}
	finally
		 { System.out.println("finally4 is executed");}


		}
	catch(ArithmeticException e)
		 { System.out.println("catch5 is executed");}
	finally
		 { System.out.println("finally5 is executed");}
		
			}
		
}    


/*
5.By using multiple catch blocks, write a class to demonstrate the order of the execution of the 
catch blocks usingNegativeArraySizeException,ArrayIndexOutOfBoundsException, 
StringIndexOutOfBoundsException, IndexOutOfBoundsException, NullPointerException,          
ArithmeticException and print the stack trace for each exception.
*/