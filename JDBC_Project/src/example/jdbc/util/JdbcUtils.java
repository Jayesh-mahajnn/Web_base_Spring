package example.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	
	public static Connection getConnection() throws Exception{
	
//		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String connectionURL ="jdbc:mysql://localhost:3306/cdac?useSSL=false";
		String userId = "root";
		String password = "Ycpait24";
		
//		Class.forName(driverClassName);
		
	  return DriverManager.getConnection(connectionURL,userId, password);
	  
	}

}
