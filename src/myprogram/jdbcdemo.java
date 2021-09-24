package myprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcdemo {

	public static void main(String[] args) throws Exception {
		
		
		//loading the oracle driver
				//drivername is case sensitive
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//DriverManager  is a class
				//Statement,ResultSet,Connection are interfaces
				//1521 is the default port number for ORACLE database

				//XE is the name of the database
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
				Statement st=con.createStatement();//build sql statements
				ResultSet rs=st.executeQuery("select * from student");//ResultSet means rows and columns
				while(rs.next())//iterate the records one by one!
				{
					//EITHER COLUMN NAME OR COLUMN POSITION INDEX 1,2,3....
					int a=rs.getInt(1);//column name
					String b=rs.getString(2);//2nd column=>name
					String c=rs.getString(3);
					float d=rs.getFloat(4);
					System.out.println(a+ " "+b + " "+c + " "+d );
				}
				rs.close();
				con.close();//release DB connection
				
		
		
		
		
		
	}

}
