package myprogram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setinterface {

	public static void main(String[] args) {
	/*	
		HashSet obj=new HashSet();
		obj.add("vasanth");
		obj.add(258.55f);
		obj.add(new Float(147.99f));
		obj.add(new Double(12345.859d));
		obj.add(189.52d);
		obj.add(new Integer(123));
		obj.add('a');
		
		System.out.println("HashSet(Unordered):: "+obj);
		System.out.println("HashSet Size:: "+obj.size());
		System.out.println("HashSet Empty??:: "+obj.isEmpty());	
		
		Iterator i1=obj.iterator();
		while(i1.hasNext())
		{
			System.out.println("details "+i1.next());
		}
		obj.clear();
		System.out.println("HashSet Empty??:: "+obj.isEmpty());
		 
		 */
		
		
		//LinkedHashSet obj21=new LinkedHashSet();
	/*	
	 	Set obj2=new LinkedHashSet();
	 	obj2.add("Java");
		obj2.add(3434.3434);
		obj2.add("JSP");
		obj2.add(453.431f);
		obj2.add(453.431f);
			
		//System.out.println("LinkedHashSet(Ordered):: "+obj2);
		Iterator i2=obj2.iterator();
		while(i2.hasNext())
		{
			System.out.println("details "+i2.next());
		}
		obj2.clear();
		System.out.println("HashSet Empty??:: "+obj2.isEmpty());
		*/
		
		
		Set t1=new TreeSet();
		t1.add("Java");
		t1.add("Ejb");
		t1.add("Mainframe");
		t1.add("ASP.NET");
		t1.add("C++");
		
		Iterator i3=t1.iterator();
		while(i3.hasNext())
		{
			System.out.println("details "+i3.next());
		}
		t1.clear();
		System.out.println("HashSet Empty??:: "+t1.isEmpty());
	}

}
