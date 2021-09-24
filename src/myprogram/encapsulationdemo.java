package myprogram;

class test
{   
	private int s;

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	}

public class encapsulationdemo {
    int id;
    String productname;
    float price;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public static void main(String[] args) {
		encapsulationdemo s1=new encapsulationdemo();
		s1.setId(100);
		s1.setProductname("pen");
		s1.setPrice(10);
		System.out.println("details : "+s1.getId() + s1.getProductname() +s1.getPrice());
		
		test t1=new test();
		t1.setS(123);
		System.out.println(t1.getS());
		

	}

}
