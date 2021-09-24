package myprogram;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Bank_Acc12
{
	int accno;
	String name;
	int years;
	public Bank_Acc12(int accno, String name, int years) {
		super();
		this.accno = accno;
		this.name = name;
		this.years = years;
	}
	@Override
	public String toString() {
		return accno + " "+ name + " "+ years;
	}

}
class NameSorting implements Comparator<Bank_Acc12>
{
	@Override
	public int compare(Bank_Acc12 a1, Bank_Acc12 a2) 
	{
		//Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. 
		return a1.name.compareTo(a2.name);//obj1.compareTo obj2
	}
}
class YearsSorting implements Comparator<Bank_Acc12>
{
	@Override
	public int compare(Bank_Acc12 a1, Bank_Acc12 a2) 
	{if(a1.years==a2.years)
	{
		return 0;
	}
	else if(a1.years > a2.years)
	{
		return 1;
	}
	else
	{
		return -1;
	}
	}
}


public class Collection_Comparator1 {

	public static void main(String[] args) {
		
		Bank_Acc12 b1=new Bank_Acc12(11,"Devi",6);
		Bank_Acc12 b2=new Bank_Acc12(13,"Abi",2);
		Bank_Acc12 b3=new Bank_Acc12(8,"Daya",4);
		Bank_Acc12 b4=new Bank_Acc12(4,"Raja",3);
		Bank_Acc12 b5=new Bank_Acc12(12,"Lakshmi",7);

		ArrayList<Bank_Acc12> obj=new ArrayList<Bank_Acc12>();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);

		System.out.println("Before Sorting::");
		for(Bank_Acc12 t:obj)
		{
			System.out.println(t);
		}
		Collections.sort(obj,new NameSorting());
		System.out.println("After Sorting(By Accholdername)::");
		for(Bank_Acc12 t:obj)
		{
			System.out.println(t);			
		}
		Collections.sort(obj, new YearsSorting());
		System.out.println("After Sorting(By Years)::");
		for(Bank_Acc12 t:obj)
		{
			System.out.println(t);
		}
		
		

	}

}
