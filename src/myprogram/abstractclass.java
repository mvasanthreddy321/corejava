package myprogram;
abstract class shop
{   void offers()
{
	System.out.println("10-30% discount");
}
	abstract void paymentgateway();
	abstract void delivery();
	}
 abstract class amazon extends shop
{

	@Override
	void paymentgateway() {
		// TODO Auto-generated method stub
		System.out.println("Do payment here");
	}

	

	}
public class abstractclass  extends amazon{
	void feedback()
	{
		System.out.println("Good!");
	}
	public static void main(String[] args) {
		
        abstractclass s1= new abstractclass();
        s1.feedback();
        s1.delivery();
        s1.offers();
        s1.paymentgateway();
        amazon s2=new abstractclass();
        s2.paymentgateway();
        s2.offers();
        s2.delivery();
        ((abstractclass)s2).feedback();
        
        shop s3= new abstractclass ();
        s3.paymentgateway(); s3.offers();s3.delivery();
        ((abstractclass)s3).feedback();
        
	}

	@Override
	void delivery() {
		// TODO Auto-generated method stub
	 System.out.println("Product will be deliverd");	
	}

}
