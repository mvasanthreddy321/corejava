package myprogram1;

import java.util.LinkedHashSet;

public class Sample31 {

	public static void main(String[] args) {
		
      LinkedHashSet <String>s=new LinkedHashSet();
      s.add("MONDAY");
      s.add("TUESDAY");
      s.add("WEDNESDAY");
      s.add("THURSDAY");
      s.add("FRIDAY");
      s.add("SATURDAY");
      s.add("SUNDAY");
      
      for(Object i : s)
      {
    	  System.out.println(i);
      }
      
      System.out.println(s.size());
      
      String s1[]=s.toArray(new String[0]);
      
      System.out.println("array");
      for(int i=0;i<s1.length;i++)
      {   
    	  System.out.print(s1[i] + " ");
      }
      
      
	}

}


/*
1.Create a collection that will contain the names of the days in a week. Print the collection. 
Display the length of the collection and convert the collection into an array and print it.
*/