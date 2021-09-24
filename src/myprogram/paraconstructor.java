package myprogram;

class emps
{
	int a;
	String b;
	
	public emps(int a, String b) {
		super();
		this.a = a;
		this.b = b;
		
	}
	public int calcpay()
	{
		return 0;
	}
	public void comments()
	{
		System.out.println("Feedback noted!");
	}
}
class salariedemployees extends emps
{
    int c1;
	
	public salariedemployees(int a,String b,int c)
	{
		super(a,b);
		c1=c;
	}
	@Override
	public int calcpay()
	{
		return c1*1000;
	}
	@Override
	public void comments()
	{
		System.out.println("Good!");
	}
}	
class contractemployee extends emps
{  int c2;
	public contractemployee(int a, String b,int c) {
		super(a, b);
	   c2=c;
	}
	@Override
	public int calcpay()
	{
		return c2*500;
	}

	@Override
	public void comments()
	{
		System.out.println("Excellent!");
	}
	
	}
public class paraconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emps obj[]=new emps[2];//Array of objects
		obj[0]=new salariedemployees(1001,"Thananya",50000);
		obj[1]=new contractemployee(1002,"Abi",6000);
		
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i].getClass()+ " "+obj[i].a + " "+obj[i].b + " "+obj[i].calcpay());
			obj[i].comments();
		}


	}

}
