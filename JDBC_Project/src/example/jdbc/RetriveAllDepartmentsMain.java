package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveAllDepartmentsMain { 

	public static void main(String[] args) {
		
		/* 
		 * step 1  : Load the driver 
		 * 2 : Establish connection with DB
		 * 3 : obtaine some statements 
		 * driver is the programs
		 *       
		 */
		
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String connectionURL ="jdbc:mysql://localhost:3306/cdac?useSSL=false";
		String userId = "root";
		String password = "Ycpait24";
		Connection dbConnection = null;
		Statement  stmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded");
			
		   dbConnection = DriverManager.getConnection(connectionURL,userId, password);
		   System.out.println("Connected to Mysql DB");
		   
		   stmt = dbConnection.createStatement();
		   
		   String sqlQuery = "select dname , loc,deptno from dept"; 
		   
		   rs = stmt.executeQuery(sqlQuery);
		   
		   //navigation
		   while(rs.next())
		   {
			  
			  String deptName =  rs.getString(1);
			  String deptLoc = rs.getString(2);
			  int deptNo =   rs.getInt(3);
			 
			  
			  System.out.println(deptName + ", "  + deptLoc + ", " + deptNo);
		   }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
