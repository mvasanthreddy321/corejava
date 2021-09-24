 package myprogram;

 interface brands
 {
	 void dispbrands();
		void dummy();
 }
 
 class Measurements
 {
 	void calcsize()
 	{
 		System.out.println("Measurementchart:: S,M,L,XL");
 	}
 }
 
public class interfacedemo  extends Measurements implements shopping,brands {
	@Override
	public void dispbrands() {
		// TODO Auto-generated method stub
		System.out.println(" BRANDS :");
	}

	@Override
	public void dummy() {
		// TODO Auto-generated method stub
		System.out.println("DUMMY :");
	}

	@Override
	public void discounts() {
		// TODO Auto-generated method stub
		System.out.println("DISCOUNTS :");
	}

	@Override
	public void creditpoints() {
		// TODO Auto-generated method stub
	     System.out.println("CREDIT POINTS:");	
	}
	
	public void delivery()//belong to class!
	{
		System.out.println("Home delivery available");
	}

	public static void main(String[] args) {
		
		interfacedemo d1=new interfacedemo();
		d1.dispbrands();
		d1.dummy();
		d1.discounts();
		d1.creditpoints();
		d1.delivery();
		d1.calcsize();
		
		Measurements d2=new interfacedemo();
		((interfacedemo)d2).dispbrands();
		((interfacedemo)d2).dummy();
		((interfacedemo)d2).discounts();
		((interfacedemo)d2).creditpoints();
		((interfacedemo)d2).delivery();
		d2.calcsize();
		 
		brands d3= new interfacedemo();
		d3.dispbrands();
		d3.dummy();
		((interfacedemo)d3).discounts();
		((interfacedemo)d3).creditpoints();
		((interfacedemo)d3).delivery();
		((interfacedemo)d3).calcsize();
		

	}


}
