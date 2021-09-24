package myprogram1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class employee
 {  
	@Override
	public String toString() {
		return id +" "+name +" "+dept;
	}
	int id;
	String name;
	String dept;
	public employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	
 }




public class Sample33 {

	public static void main(String[] args) {
		
		employee e1=new employee(1,"vasanth","ece");
		employee e2=new employee(2,"vamshi","ece");
		employee e3=new employee(3,"varshith","cse");
		employee e4=new employee(4,"rohith","eee");
		employee e5=new employee(5,"priya","civil");
		
		List<employee> l1=new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		 for(Object i : l1)
		 {
			 System.out.println(i);
		 }
		
		 Map<String, employee>m1=new HashMap();
		m1.put(e1.name,e1);
		m1.put(e2.name,e2);
		m1.put(e3.name,e3);
		m1.put(e4.name,e4);
		m1.put(e5.name,e5);
		
		for(Map.Entry<String, employee>a : m1.entrySet())
		{
			
			System.out.println("key&value  "+a.getKey() +" "+ a.getValue());
		}
		Scanner s1=new Scanner(System.in);
		System.out.println("name");
		String str=s1.next();
	  if(m1.containsKey(str))
	  { 
		 System.out.println(m1.get(str));
	  }
	  else
	  {
		  System.out.println("Not Found");
	  }
		
	}

}


/*
3.Create a class Employee with name and other attributes.
Populate an ArrayList<Employee> with 10 Employees. 
From the list populate a Map<String, Employee> where the key is the employee's name and the value is the employee object. 
Use Scanner to get a name from the keyboard and retrieve the employee from the map using that name if it exists.
Print the contents of the retrieved employee object on the screen.
*/