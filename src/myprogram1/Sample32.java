package myprogram1;

import java.util.Iterator;
import java.util.LinkedList;

public class Sample32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList q2=new LinkedList();
		q2.add(1);
		q2.add(2);
		q2.add(3);
		q2.add(4);
		q2.add(5);
		q2.add(6);
		q2.add(7);
		q2.add(8);
		q2.add(9);
		q2.add(10);
		q2.add(11);
		q2.add(12);
		for(Object i : q2)
		{
			System.out.print(i +" ");
		}
		
		System.out.println(" After using Queue");
		
		Iterator i5=q2.iterator();
		while(i5.hasNext())
		{
			q2.poll();
		}
		
		System.out.println(q2.isEmpty());
		

	}

}

/*
2.Consider placing a dozen of bangles in a bangle stand. Number the bangles from 1 to 12.
 Now start removing the bangles from the stand.
  Simulate this scenario with the help of Queue Interface.
*/