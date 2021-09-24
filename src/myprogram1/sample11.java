package myprogram1;

class Student
  {
	int rollno;
	String studname;
	int marksineng;
	int marksinmaths;
	int marksinscience;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getMarksineng() {
		return marksineng;
	}
	public void setMarksineng(int marksineng) {
		this.marksineng = marksineng;
	}
	public int getMarksinmaths() {
		return marksinmaths;
	}
	public void setMarksinmaths(int marksinmaths) {
		this.marksinmaths = marksinmaths;
	}
	public int getMarksinscience() {
		return marksinscience;
	}
	public void setMarksinscience(int marksinscience) {
		this.marksinscience = marksinscience;
	}
	
	}

public class sample11 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollno(100);
		s1.setStudname("vasanth");
	    s1.setMarksineng(90);
	   s1.setMarksinmaths(80);
	   s1. setMarksinscience(70);
	   
	   Student s2=new Student();
		s2.setRollno(100);
		s2.setStudname("vamshi");
	    s2.setMarksineng(80);
	   s2.setMarksinmaths(88);
	   s2. setMarksinscience(59);
		
		
		
	System.out.println("details"+s1.getRollno()+" "+s1.getStudname()+" "+s1.getMarksineng()+" "+s1.getMarksinmaths()+" "+s1.getMarksinscience());
		
	System.out.println("details"+s2.getRollno()+" "+s2.getStudname()+" "+s2.getMarksineng()+" "+s2.getMarksinmaths()+" "+s2.getMarksinscience());
	

	}

}

/*
1.Create a class called Student with the following details: RollNo, StudName, MarksInEng, 
MarksInMaths and MarksInScience. Write getters and setters for the all variables. RollNo
should be automatically generated whenever a new student is added.
a)To display the roll no and the name of the student who scored highest mark 
in mathematics.*/