package myprogram;

interface process1
{   void startup();
	}

interface process2
{   void shutdown();
	}
interface process3 extends process1,process2
{    void comments();
	}

public class interfaceclass  implements process3{
	void rating()
	{
		System.out.println(" GOOD ");
	}

	public static void main(String[] args) {
		interfaceclass s1=new interfaceclass();
		s1.startup();
		s1.shutdown();
		s1.comments();
		s1.rating();
		
		System.out.println("polymorphism object");
		process3 s2=new interfaceclass();
		s2.startup();
		s2.shutdown();
		s2.comments();
		((interfaceclass)s2).rating();
		
		
		if(s2 instanceof process1)
		{
			System.out.println("Yes!Process1");
		}
		if(s2 instanceof process2)
		{
			System.out.println("Yes!Process2");
		}
		if(s2 instanceof process3)
		{
			System.out.println("Yes!Process3");
		}
		if(s2 instanceof interfaceclass)
		{
			System.out.println("Yes!Process4");
		}


	}

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("Log files are created!");	
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Log files are cleared!");	
	}

	@Override
	public void comments() {
		// TODO Auto-generated method stub
		System.out.println("Server Synchronized and Tuned!");	
	}

}
