package myprogram;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist1 {
     
	@SuppressWarnings({"unchecked","rawinputs"})
	public static void main(String[] args) {
		
		
		Queue q1=new LinkedList();
		q1.add("30");
		q1.add("Java");
		q1.add("20");
		q1.add(43.43f);
		q1.add(20);
		q1.add(20);
		System.out.println("Queue::"+q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println("Queue::"+q1);
		q1.add("PHP");//added at the end of the queue
		System.out.println("Queue::"+q1);
        Iterator i1= q1.iterator();
        while(i1.hasNext())
        {
        	q1.poll();
        }
        System.out.println("Empty? "+q1.isEmpty());
		System.out.println("Size? "+q1.size());
       
        
        
	}

}
