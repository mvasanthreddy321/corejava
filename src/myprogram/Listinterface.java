package myprogram;

import java.util.ArrayList;

public class Listinterface {

	public static void main(String[] args) {
		
		ArrayList obj=new ArrayList();
		obj.add(3434);
		obj.add("Java");
		obj.add('A');
		obj.add(43.54F);
		obj.add("jsp");
		obj.add("jsp");
		
		System.out.println(obj);
		obj.add(3,"vasanth");
		for(Object i : obj)
		{
			System.out.println(i);
		}
		
		System.out.println(obj);
		
		System.out.println("Get:: "+obj.get(4));//retrieve
		obj.set(3,"Ruby");//modify

		
	}

}
