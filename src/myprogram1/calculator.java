package myprogram1;

public class calculator {
	//int x,y;
	void add(int a, int b)
	{  int sum=a+b;
		//x=a;y=b; int sum=x+y;
		System.out.println(" sum is "+sum);
	}
	void substract(int a, int b)
	{   int substract=a-b;
		//x=a;y=b; int substract=x-y;
		System.out.println(" substraction is "+substract);
	}
	void multiply(int a, int b)
	{   int multiply=a*b;
		//x=a;y=b; int multiply=x*y;
		System.out.println(" multiplication is "+multiply);
	}
	void division(int a, int b)
	{ int divide=a/b;
		//x=a;y=b; int divide=x/y;
		System.out.println(" quotient is "+divide);
	}

	public static void main(String[] args) {
		calculator c1=new calculator();
		c1.add(10,5);
		c1.substract(10, 5);
		c1.multiply(10, 5);
		c1.division(10,5);
		

	}

}

/*
11. Create a class called Calculator which has 4 different methods add, diff, mul and div which 
accepts two numbers as parameters. Create an object to access these methods and invoke 
these methods with two numbers and display the result in the corresponding methods. 
*/