package myprogram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Employees4
{
	int id;
	String name;
	float salary;
	public Employees4(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	

	@Override
	public String toString() {
		return id +" "  + name + " "  + salary ;
	}
	
	}
	
	

public class Setinterface1 {

	public static void main(String[] args) {
		
		Employees4 obj=new Employees4(1,"Devi",40405.43f);
		Employees4 obj1=new Employees4(6,"Abi",50405.43f);
		Employees4 obj2=new Employees4(3,"Daya",80405.43f);
		Employees4 obj3=new Employees4(2,"Kani",20405.43f);
		Employees4 obj4=new Employees4(9,"Raja",96405.43f);
		
		Set a1=new HashSet();
		a1.add(obj);
		a1.add(obj1);
		a1.add(obj2);
		a1.add(obj3);
		a1.add(obj4);
		
		for(Object i :a1)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Size:: "+a1.size());
		
		Set a2=new LinkedHashSet();
		
		a2.add(obj);
		a2.add(obj1);
		a2.add(obj2);
		a2.add(obj3);
		a2.add(obj4);
		for(Object i :a2)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Size:: "+a2.size());
		
		Iterator i1 =a2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
