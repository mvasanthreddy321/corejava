package myprogram1;
class vehicle
{ String color;
  int wheels;
  int model;
public vehicle(String color, int wheels, int model) {
	super();
	this.color = color;
	this.wheels = wheels;
	this.model = model;
}
  void review()
  {
	}
}
class truck extends vehicle
{   truck(String color,int wheels,int model)
	{
	  super(color,wheels,model);
	  }
     void review()
     {   
    	 System.out.println(" good");
     }
	}
class bus extends vehicle
{ 
	 bus(String color,int wheels,int model)
	{ 
		super(color,wheels,model);
	}
	}


public class sample14 {

	public static void main(String[] args) {
		vehicle obj[]= { new truck("blue",4,2021),new bus("red",2,2020)};
		
		obj[0].review();
		

	}

}

/*
7.Create a class called Vehicle. Create subclasses like Truck, Bus, Car etc. Add common methods 
in the base class and specific methods in the corresponding class. Create a class called Road 
and create objects for the Truck, Car, Bus etc and display the appropriate message. 

In the Vehicle class constructor initialize few variables like color, no of 
wheels, model etc. Give appropriate values for these variables from the invoking subclass.  
*/