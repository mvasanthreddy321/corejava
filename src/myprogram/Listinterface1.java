package myprogram;

import java.util.ArrayList;

class Customer
{
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}


	int id;
	String name;
	

public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



}

public class Listinterface1 {
	
	@SuppressWarnings({"unchecked","rawtypes"})

	public static void main(String[] args) {
		
		Employees4 obj=new Employees4(1,"Devi",40405.43f);//Existing java class!
		Employees4 obj1=new Employees4(6,"Abi",50405.43f);
		Employees4 obj2=new Employees4(3,"Daya",80405.43f);
		Employees4 obj3=new Employees4(2,"Kani",20405.43f);
		Employees4 obj4=new Employees4(9,"Raja",96405.43f);
		
		ArrayList b1=new ArrayList();
		
		b1.add(obj);
		b1.add(obj1);
		b1.add(obj2);
		b1.add(obj3);
		b1.add(obj4);
		
		Customer c1=new Customer(11,"Madhu");
		b1.add(c1);
		for(Object i : b1)
		{
			System.out.println(i);                                
		}
		        Object g1=  b1.get(3);                                          
		         System.out.println(g1);
		
		         ArrayList<Employees4> b2=new ArrayList<Employees4>();
		         b2.add(obj);
		 		b2.add(obj1);
		 		b2.add(obj2);
		 		b2.add(obj3);
		 		b2.add(obj4);
		 		      
		 		for(Employees4 i:b2)
				{
					System.out.println(i.toString());
				}
		 		
		 		 Employees4 arc=  b2.get(4);
		 		 System.out.println(arc);
		 		 
		 		
	}

}
