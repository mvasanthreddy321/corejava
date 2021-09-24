package myprogram;

import java.util.Scanner;

class Course
{
	int courseid;
	String coursename;
	int course_years;
	
public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getCourse_years() {
		return course_years;
	}

	public void setCourse_years(int course_years) {
		this.course_years = course_years;
	}
}
public class arrayobjects {

	public static void main(String[] args) {
		Course c1[]=new Course[4];
		Scanner s1=new Scanner(System.in);
		
	for(int i=0;i<c1.length;i++)
	{
		int t=s1.nextInt();
		s1.nextLine();
		String t1=s1.nextLine();
		int t11=s1.nextInt();
		
		c1[i]=new Course();
		c1[i].setCourseid(t);
		c1[i].setCoursename(t1);
		c1[i].setCourse_years(t11);
		
	}
	for(int i=0;i<c1.length;i++)
	{
		System.out.println("CourseDetails:: "+c1[i].getCourseid() + " "+c1[i].getCoursename() + " "+c1[i].getCourse_years());
	}
	
	}

}
