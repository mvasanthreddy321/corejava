package myprogram;

import java.util.ArrayList;
import java.util.Collections;

class Bank_Acc implements Comparable<Bank_Acc>
{
	@Override
	public String toString() {
		return +accno +" "+name+" "+years;
	}

	int accno;
	String name;
	int years;

public Bank_Acc(int accno, String name, int years) {
		super();
		this.accno = accno;
		this.name = name;
		this.years = years;
	}

@Override
public int compareTo(Bank_Acc b)
{
	if(years==b.years)
	{
		return 0;
	}
	else if(years>b.years)
	{
		return 1;
	}
	else
	{
		return -1;
	}
	
	
	
     }


}







public class Comparableinterface {

	public static void main(String[] args) {
		
		Bank_Acc b1=new Bank_Acc(11,"Devi",6);
		Bank_Acc b2=new Bank_Acc(13,"Abi",2);
		Bank_Acc b3=new Bank_Acc(8,"Daya",4);
		Bank_Acc b4=new Bank_Acc(4,"Raja",3);
		Bank_Acc b5=new Bank_Acc(12,"Lakshmi",7);
		ArrayList<Bank_Acc> obj=new ArrayList<Bank_Acc>();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		System.out.println("Before Sorting::");
		for(Bank_Acc t:obj)
		{
			System.out.println(t);
		}
		
		Collections.sort(obj);
		System.out.println("After Sorting::");
		for(Bank_Acc t:obj)
		{
			System.out.println(t);
		}
		
	}
	

	}


