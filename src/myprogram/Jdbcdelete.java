package myprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Jdbcdelete {

	public static void main(String[] args) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		
		Scanner s1=new Scanner(System.in);
		System.out.println("ID:: ");
		int a=s1.nextInt();
	//	s1.nextLine();
	//	System.out.println("Incentive:: ");
	//	float d=s1.nextFloat();
		
		String query1="delete from student where id=?";
		PreparedStatement ps1=con.prepareStatement(query1);
		
		//ps1.setFloat(1, d);//1 refers first question marks
		ps1.setInt(1, a); 

		int rows=ps1.executeUpdate();
		if(rows>=1)
		{
			System.out.println("Record Exist!");
			System.out.println(rows+ " Record Deleted!");
		}
		else
		{
			System.out.println("Record Not Exist!");
		System.out.println(rows+ " Record Deleted!");			
		}
		
		PreparedStatement ps11=con.prepareStatement("select * from student");
		//EXECUTEQUERY METHOD MAINLY FOR SELECT STATEMENTS!
		ResultSet rs=ps11.executeQuery();
		while(rs.next())
		{
			int a1=rs.getInt(1);
			String b1=rs.getString(2);//2nd column=>empname
			float d1=rs.getFloat(4);
			String c1=rs.getString(3);
			System.out.println(a1+ " "+b1 + " "+c1+ " "+d1);
		}
		rs.close();
		con.close();//release DB connection
		
		

	}

}
