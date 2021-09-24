package myprogram1;


import java.util.Map;
import java.util.TreeMap;

public class Sample34 {

	public static void main(String[] args) {
		Map<String,Long>m2=new TreeMap<>();
		m2.put("vasanth",7993749321l);
		m2.put("vamshi",8464062502l);
		m2.put("samatha",9701501924l);
		m2.put("prabhakar",9849773172l);
		m2.put("vasanthreddie",8555993769l);
		
		for(Map.Entry<String, Long>a : m2.entrySet())
		{
			
			System.out.println("key&value  "+a.getKey() +" "+ a.getValue());
		}
		
		

	}

}

/*
4.Write a program to implement a telephone directory. Display the details.(Use Map Interface)
*/