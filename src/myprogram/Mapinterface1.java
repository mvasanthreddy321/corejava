package myprogram;

import java.util.HashSet;

class Student62
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student62 other = (Student62) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return id+ " "+ name;
	}
	int id;
	String name;
	public Student62(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
    

}


public class Mapinterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student62 s1=new Student62(1,"devi");
		Student62 s2=new Student62(1,"devi");
		Student62 s3=new Student62(2,"abi");
		Student62 s4=new Student62(3,"rajan");

		HashSet<Student62> obj=new HashSet<>();//unordered collection
		obj.add(s1);//custom object s1 and s2 address are different but values are same!!!
		obj.add(s2);
		obj.add(s3);
		obj.add(s4);
		
		for(Object i:obj)
		{
			System.out.println(i);
		}
		System.out.println("S1 EQUALS S2:: "+s1.equals(s2));
		System.out.println("S1 EQUALS S3:: "+s1.equals(s3));
		
		
	}

}
