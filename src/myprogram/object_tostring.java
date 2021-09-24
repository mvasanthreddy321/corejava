package myprogram;

class user
{  String name;
   String address;
public user(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	/*return "object_tostring [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]"; */
	return "good morning";
}
	}

public class object_tostring {

	@Override
	public String toString() {
		/*return "object_tostring [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]"; */
		return " very good morning";
	}
	public static void main(String[] args) {
		
		user a1=new user("vasanth","hyderabad");
		 System.out.println("name is "+a1.name);
		 System.out.println("address is "+a1.address);
		 System.out.println("user "+a1);
		 
		 object_tostring a2=new object_tostring();
		 System.out.println("user "+a2);
	}

}
