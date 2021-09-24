package myprogram1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Bookstore
{
	@Override
	public String toString() {
		return bookid +" "+ name;
	}
	int bookid;
	String name;
	public Bookstore(int bookid, String name) {
		super();
		this.bookid = bookid;
		this.name = name;
	}
	
}

class Idsorting implements Comparator<Bookstore>
{

	@Override
	public int compare(Bookstore a1, Bookstore a2) {
		
		if(a1.bookid==a2.bookid)
		{
			return 0;
		}
		else if(a1.bookid > a2.bookid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	


	
}

class Namesorting implements Comparator<Bookstore>
{

	@Override
	public int compare(Bookstore a1, Bookstore a2) {
		// TODO Auto-generated method stub
		return a1.name.compareTo(a2.name);
	}
	


}

public class Sample36 {

	public static void main(String[] args) {
		LinkedList<Bookstore> x1=new LinkedList<>();
		x1.add(new Bookstore(1,"vasanth"));
		x1.add(new Bookstore(11,"vamsy"));
		x1.add(new Bookstore(12,"anirudh"));
		x1.add(new Bookstore(13,"campbuzz"));
		x1.add(new Bookstore(14,"jeevan"));
		
		for(Object i : x1)
		{
			System.out.println(i);
		}
		
		System.out.println("after id sorting");
		Collections.sort(x1,new Idsorting());
		
		for(Object i : x1)
		{
			System.out.println(i);
		}
		
		
		System.out.println("after Name sorting");
       Collections.sort(x1,new Namesorting());
		
		for(Object i : x1)
		{
			System.out.println(i);
		}
		
		

	}

}


/*
6.Create a class called BookStore with fields Bookid and Bookname.  Sort using comparator and 
display the output by sorting based on book name and book id.
*/