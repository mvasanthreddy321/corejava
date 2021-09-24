package myprogram1;

public class shape {
	
	void area(int a)
	{
		int area1=a*a;
		System.out.println(" Square area is "+area1);
	}
	
	void perimeter(int a)
	{
		int perimeter=4*a;
		System.out.println(" Square perimeter is "+perimeter);
	}
	void area(int a,int b)
	{
		int area2=a*b;
		System.out.println(" Rectangle area is "+area2);
	}
	void perimeter(int a,int b)
	{
		int x=2*(a+b);
		System.out.println(" Rectangle perimeter is "+x);
	}
	

	public static void main(String[] args) {
		shape s1=new shape();
		s1.area(5);
		s1.area(5,10);
		s1.perimeter(5);
		s1.perimeter(5,10);

	}

}
/*
12.Create a class called shape with the following methods
1. area
2. perimeter

                    Overload the area and perimeter method to calculate for both square and rectangle.
                    Create a main class and invoke the area method to calculate the area of the square and 
rectangle. Also invoke the perimeter method to calculate the perimeter of the square 
and rectangle.
*/