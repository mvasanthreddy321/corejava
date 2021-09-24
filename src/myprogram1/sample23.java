package myprogram1;


interface payable
{ 
	void getpayinfo();
	}

class worker1 implements payable
{

	@Override
	public void getpayinfo() {
		// TODO Auto-generated method stub
		System.out.println("Monthly pay of the worker is 10000");
	}
	
}

class dailyworker1 implements payable
{

	@Override
	public void getpayinfo() {
		System.out.println("Monthly pay of the worker is 20000");
		
	}
 
	
}

class salaryworker1 implements payable
{

	@Override
	public void getpayinfo() {
		// TODO Auto-generated method stub
		System.out.println("Monthly pay of the worker is 40000");
	}
	
	
}

public class sample23 {

	public static void main(String[] args) {
		
		worker1 a1=new worker1();
		salaryworker1 a2=new salaryworker1();
		dailyworker1 a3=new dailyworker1();
		a1.getpayinfo();
		a3.getpayinfo();
		a2.getpayinfo();
		
	}
}


/*
3. create a package called finance and within it create an interface called 
Payable. It should define the getPayInfo () method that all the worker classes will implement.Now display the details of the monthly pay of the workers.

Hint:: Use Worker,DailyWorker,SalariedWorker classes
*/