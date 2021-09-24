package myprogram;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JDBCMetaDataDemos {

	public static void main(String[] args) throws Exception {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
		
		PreparedStatement ps1=con.prepareStatement("select * from student");
		ResultSet rs=ps1.executeQuery();
		
		ResultSetMetaData rsobj=rs.getMetaData();
		int cols = rsobj.getColumnCount();//4
		//1 refers 1st column in the table
		System.out.println("Total Columns:: "+rsobj.getColumnCount());
		System.out.println("1st ColumnName:: "+rsobj.getColumnName(1));
		System.out.println("1st Column datatype:: "+rsobj.getColumnTypeName(1));//datatype
		for (int i=1;i<=cols;i++) 
		{
			String colName = rsobj.getColumnName(i);
			String colType = rsobj.getColumnTypeName(i);
			System.out.println(colName+" of type "+colType);			
		}		
		
		DatabaseMetaData dbmd=con.getMetaData();  
		System.out.println("Driver Name: "+dbmd.getDriverName());  
		System.out.println("Driver Version: "+dbmd.getDriverVersion());  
		System.out.println("UserName: "+dbmd.getUserName());  
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

		
		

	}

}
