package day8_2.Example2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	
	public static Connection createConnection()
	{
		Connection conn = null;
		try
		{
			// Confirm Driver Load
			System.out.println("Driver Loaded successfully!");
		
			// Create connection
			String url = "jdbc:mysql://localhost:3306/JDBC_db";
			String userName = "root";
			String userPass = "root";
			conn = DriverManager.getConnection(url, userName, userPass);
			System.out.println("Database JDBC_db connected successfully!");
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		return conn;
	}

}
