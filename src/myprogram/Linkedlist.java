package myprogram;

import java.util.LinkedList;

public class Linkedlist {
    
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void main(String[] args) {
		
		Employees4 obj=new Employees4(1,"Devi",40405.43f);
		Employees4 obj1=new Employees4(6,"Abi",50405.43f);
		Employees4 obj2=new Employees4(3,"Daya",80405.43f);
		Employees4 obj3=new Employees4(2,"Kani",20405.43f);
		Employees4 obj4=new Employees4(9,"Raja",96405.43f);
		Employees4 obj5=new Employees4(19,"Thananya",209405.43f);
		
		LinkedList<Employees4> a1=new LinkedList<>();
		a1.add(obj);
		a1.add(obj1);
		a1.add(obj2);
		a1.add(obj3);
		a1.add(obj4);
		a1.addFirst(obj5);
		a1.addLast(obj1);
		
		for(Object i : a1)
		{
			System.out.println(i);
		}
		
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
	}

}
