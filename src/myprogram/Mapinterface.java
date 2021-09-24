package myprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Double>ab=new HashMap<>();
		ab.put("vasanth",1.25);
		ab.put("vasant",2.25);
		ab.put("vasan",1.25);
		
		for(String i: ab.keySet())
		{
			System.out.println(i);
		}
		for(Double i: ab.values())
		{
			System.out.println(i);
		}
		for(Map.Entry<String, Double> i: ab.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		Iterator i1=ab.keySet().iterator();
		while(i1.hasNext())
		{
			String s1=(String)i1.next();
			System.out.println(s1+" "+ab.get(s1));
		}
		
		/*
		LinkedHashMap<Integer,String> obj=new LinkedHashMap<>();//key,value
		obj.put(3, "Devi");
		obj.put(2, "Abi");
		obj.put(6, "Sam");
		
		System.out.println("LinkedHashMap(Ordered):: "+obj);

		TreeMap<Integer,String> obj1=new TreeMap<>();
		obj1.put(3, "Devi");//Based on keys records are sorted
		obj1.put(2, "Abi");
		obj1.put(6, "Sam");
		System.out.println("TreeMap(Sorted):: "+obj1);  */
		
		
		

	}

}
