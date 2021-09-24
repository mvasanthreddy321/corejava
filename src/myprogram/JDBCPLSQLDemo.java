package myprogram;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCPLSQLDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Id:: ");
		int a=s1.nextInt();
		
		System.out.println("Name:: ");
		String b=s1.next();
		
		System.out.println("Dept:: ");
		String c=s1.next();
		System.out.println("Salary:: ");
		float d=s1.nextFloat();
		
		CallableStatement cs=con.prepareCall("{call javaoracle(?,?,?,?)}");//calling the procedure
		cs.setInt(1,a);
		cs.setString(2, b);
		cs.setFloat(4, d);
		cs.setString(3, c);
		
		int rows=cs.executeUpdate();
		System.out.println(rows + "Record Inserted!");
		
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
