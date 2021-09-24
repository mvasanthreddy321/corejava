package myprogram1;


class worker
  { 
	String name;
	int salaryrate;
	void pay()
	{
		
	}
	}
class dailyworker extends worker
  {  int salary;
	void pay(int hours)
	{   salary=hours*1000;
		System.out.println("salary is  "+salary);
	}
	}
class salariedworker extends worker
  {  int salary;
	void pay(int days)
	{
		salary=days*500;
		System.out.println("salary is  "+salary);
	}
	}


public class sample15 {
	
	static
		{   System.out.println("static block executed first");
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      dailyworker d1=new dailyworker();
      salariedworker s1=new salariedworker();
      d1.pay(40);
      s1.pay(6);
      if(d1  instanceof dailyworker )
      {
    	  System.out.println("valid");
      }
      else
      {
    	  System.out.println("invalid");
      }
      
      
      
	}

}

/*
6.Create a class called Worker. Write classes DailyWorker and SalariedWorker that inherit from
Worker. Every worker has a name and a salaryrate. Write method Pay (int hours) to compute 
the week pay of every worker.  A Daily worker is paid on the basis of the number of days 
she/he works. The salaried worker gets paid the wage for 40 hours a week no matter what the
actual hours are.  Test this program to calculate the pay of workers. 
Include the  concept of Static block and instance of keyword!
*/