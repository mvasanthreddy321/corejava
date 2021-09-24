package myprogram;

import java.util.Arrays;
import java.util.Scanner;

class NameFormatException extends Throwable
{

	@Override
	public String toString() {
		return " Invalid Name Format";
	}
	
	}

class AgeRangeException extends Exception
{

	@Override
	public String toString() {
		return "Invalid Age Range";
	} 
	}

class Doctor
{
	int docid;
	String docname;
	String specialization;
	int age;
	Doctor(int a,String dname,String d,int dage)
	{
		this.docid=a;
		this.specialization=d;
		int temp=0;
		for(int i=0;i<dname.length();i++)
		{
			char ch;
			ch=dname.charAt(i);
			if(ch < 'A' || ch > 'Z' && ch < 'a' || ch>'z')
			{
				temp=1;
			}		
		try
		{
			if(temp==1)
			{
				throw new NameFormatException();
			}
			else
			{
				this.docname=dname;
			}
		}
		catch(NameFormatException e)
		{
			System.out.println("Error "+e);
		}
			
		}
		try
		{
			if(dage>=21 && dage<=50)
			{
				this.age=dage;//age is correct
			}
			else
			{
				throw new AgeRangeException();
			}
		}
		catch(AgeRangeException e)
		{
			System.out.println("Age Error:: "+e);
		}
		

			}
	       
	void display()
	{
		System.out.println("Doctor details:: "+docid + " "+docname + " "+age+ " "+specialization);
	}
		}
		
public class userdefinedexception {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Docid:: ");
		int a=s1.nextInt();
		System.out.println("DocName:: ");
		String b=s1.next();
		System.out.println("DocAge:: ");
		int age=s1.nextInt();
		System.out.println("DocSpecialization:: ");
		String s11=s1.next();
		
		Doctor d1=new Doctor(a,b,s11,age);
		d1.display();		

	}

}
