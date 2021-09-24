package myprogram;

import java.util.ArrayList;
import java.util.List;

abstract class Shopping11
{
	abstract void offers();
}
class Myntra11 extends Shopping11
{

	@Override
	void offers() {
		// TODO Auto-generated method stub
		System.out.println("Myntra::: 30%-50% discount");
	}
	}
class ShoppersStop11 extends Shopping11
{

	@Override
	void offers() {
		// TODO Auto-generated method stub
		System.out.println("Myntra::: 30%-40% discount");
	}


 }

public class Genricsdemo1 {
	
	static void display(List<? extends Shopping11> ob)
	{
		for(Shopping11 i : ob)
		{
			i.offers();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Myntra11> obj=new ArrayList<>();
		obj.add(new Myntra11());
		
		ArrayList<ShoppersStop11> obj1=new ArrayList<>();
		obj1.add(new ShoppersStop11());
		
		display(obj);
		display(obj1);
		
	/*	ArrayList<Integer> obj3=new ArrayList();
		display(obj3); */
		
	}

}
