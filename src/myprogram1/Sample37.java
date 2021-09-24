package myprogram1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample37 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter atomic weight");
		int a=s1.nextInt();
		
		System.out.println("Atomic Name:: ");
		String b=s1.next();
		s1.nextLine();
		System.out.println("Atomic Symbol ");
		String c=s1.next();
		
		
		
		String query1="insert into student1 values(?,?,?)";
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setInt(1, a); //1 refers first question marks
		ps1.setString(2, b);
		ps1.setString(3,c);
		
		
		
		int rows=ps1.executeUpdate();
		System.out.println(rows+ " Record inserted!");
		
		
		PreparedStatement ps11=con.prepareStatement("select * from student1");
		//EXECUTEQUERY METHOD MAINLY FOR SELECT STATEMENTS!
		ResultSet rs=ps11.executeQuery();
		
		
		
		while(rs.next())
		{
			
			int a1=rs.getInt(1);//column name
			String b1=rs.getString(2);//2nd column=>name
			String c1=rs.getString(3);
			
			System.out.println(a+ " "+b + " "+c);
		}
		rs.close();
		con.close();
		
		
	}

}


/*
7.JDBC::: The table Element has following fields (Atomic weight, Name and Chemical symbol).
 create a Element table and insert the values using prepared statement and retrieve the records from the table.
*/