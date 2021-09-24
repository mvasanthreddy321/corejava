package myprogram;

import java.util.LinkedList;
import java.util.List;

public class Genericsdemo {
	
	static void disp(List<Object>a)
	{
		for(Object i: a)
		{
			System.out.println(i);
		}
	}
	static void disp1(List<?>b)
	{
		for(Object i: b)
		{
			System.out.println(i);
		}
	}
    
   
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> l1=new LinkedList<>();
		l1.add(1);
		l1.add("vasanth");
		l1.add(23.25f);
		
		List<String>l2=new LinkedList<>();
		l2.add("vasmshi");
		l2.add("vamsy");
		
		List<Integer>l3=new LinkedList<>();
		l3.add(2);
		l3.add(5);
		
		disp(l1);
		disp1(l1);
		
		disp1(l2);
		
		disp1(l3);
		
		

	}

}
