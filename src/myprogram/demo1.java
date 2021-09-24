package myprogram;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//loading the oracle driver
				//drivername is case sensitive
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//DriverManager  is a class
				//Statement,ResultSet,Connection are interfaces
				//1521 is the default port number for ORACLE database

				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","root1234");
				Scanner s1=new Scanner(System.in);
				System.out.println("Eno:: ");
				int a=s1.nextInt();
				s1.nextLine();
				System.out.println("Name:: ");
				String b=s1.nextLine();
				System.out.println("Salary:: ");
				float c=s1.nextFloat();
				s1.nextLine();
				System.out.println("Dept:: ");
				String d=s1.nextLine();
				
				//RUNTIME INPUT
				//DML,DQL(SELECT)=>PreparedStatement Interface
				/*
				 * A PreparedStatement is a pre-compiled SQL statement
				 * The PreparedStatement interface is a subinterface of Statement. 
				 * It is used to execute parameterized query.
				 */

				String query1="insert into ltnewemps2021 values(?,?,?,?)";
				PreparedStatement ps1=con.prepareStatement(query1);
				ps1.setInt(1, a); //1 refers first question marks
				ps1.setString(2, b);
				ps1.setFloat(3,c);
				ps1.setString(4,d);
				
				//EXECUTEUPDATE METHOD MAINLY FOR DML(INSERT,UPDATE,DELETE) COMMANDS
				int rows=ps1.executeUpdate();
				System.out.println(rows+ " Record inserted!");
				
				PreparedStatement ps11=con.prepareStatement("select * from ltnewemps2021");
				//EXECUTEQUERY METHOD MAINLY FOR SELECT STATEMENTS!
				ResultSet rs=ps11.executeQuery();
				while(rs.next())
				{
					int a1=rs.getInt("eno");
					String b1=rs.getString(2);//2nd column=>empname
					float c1=rs.getFloat("salary");
					String d1=rs.getString(4);
					System.out.println(a1+ " "+b1 + " "+c1+ " "+d1);
				}
				rs.close();
				con.close();//release DB connection




	}

}
