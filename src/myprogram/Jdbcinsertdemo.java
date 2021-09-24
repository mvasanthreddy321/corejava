package myprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Jdbcinsertdemo {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Eno:: ");
		int a=s1.nextInt();
		
		System.out.println("Name:: ");
		String b=s1.next();
		
		System.out.println("Dept:: ");
		String c=s1.next();
		System.out.println("Salary:: ");
		float d=s1.nextFloat();
		
		
		String query1="insert into student values(?,?,?,?)";
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setInt(1, a); //1 refers first question marks
		ps1.setString(2, b);
		ps1.setString(3,c);
		ps1.setFloat(4,d);
		
		
		int rows=ps1.executeUpdate();
		System.out.println(rows+ " Record inserted!");
		
		
		PreparedStatement ps11=con.prepareStatement("select * from student");
		//EXECUTEQUERY METHOD MAINLY FOR SELECT STATEMENTS!
		ResultSet rs=ps11.executeQuery();
		
		
		
		while(rs.next())
		{
			
			int a1=rs.getInt(1);//column name
			String b1=rs.getString(2);//2nd column=>name
			String c1=rs.getString(3);
			float d1=rs.getFloat(4);
			System.out.println(a+ " "+b + " "+c + " "+d );
		}
		rs.close();
		con.close();
		
		
		
		
	}

}
