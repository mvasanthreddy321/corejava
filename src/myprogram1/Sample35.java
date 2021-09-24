package myprogram1;

import java.util.ArrayList;
import java.util.Collections;

class CD implements Comparable<CD>
 { 
	@Override
	public String toString() {
		return title+" "+singer;
	}
	String title;
	String singer;
	public CD(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	@Override
	public int compareTo(CD s) {
		// TODO Auto-generated method stub
		return singer.compareTo(s.singer);
	}
	
	
  }


public class Sample35 {

	public static void main(String[] args) {
		ArrayList<CD> z1=new ArrayList<>();
		
		
		z1.add(new CD("mr","vasanth"));
		z1.add(new CD("mr","vamshi"));
		z1.add(new CD("mrs","sandhya"));
		z1.add(new CD("mrs","ariya"));
		z1.add(new CD("mr","murthy"));
		
		for(Object i : z1)
		{
			System.out.println(i);
		}
		Collections.sort(z1);
		System.out.println("After sorting");
		
		
		for(Object i : z1)
		{
			System.out.println(i);
		}
		

	}

}


/*
5.Create a class called CD whose attributes are Title and singer.  Arrange the CDs in ascending 
order based on the singer name.(Use Comparable)
*/