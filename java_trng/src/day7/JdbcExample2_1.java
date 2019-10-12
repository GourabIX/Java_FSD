package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// connecting to the Product table in JDBC_db (MySQL) using PreparedStatement
public class JdbcExample2_1 {

	public static void main(String[] args) {
		
		try
		{
			// Step 1: Register the Driver class
			// Class.forName("com.mysql.jdbc.Driver");							// Statement not required for MySQL 8.0
			System.out.println("Init Success: Driver Loaded Successfully!");
			
			// Step 2: Create Connection
			String url = "jdbc:mysql://localhost:3306/JDBC_db";
			String userName = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection established: " + conn);
		
			// Step 3: Create PreparedStatement
			int productId = 110;
			String productName = "Bluetooth Speaker";
			float cost = 1699;
			
			String sqlQuery = "INSERT INTO Product VALUES(?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			
			pst.setInt(1, productId);				// Here index refers to position. Position starts from 1 unlike index which starts from 0.
			pst.setString(2, productName);
			pst.setFloat(3, cost);
		
			// Step 4: Execute queries
			int queryfate = pst.executeUpdate();
			if (queryfate == 0)
				System.out.println("Insertion has failed!");
			else
				System.out.println("Insertion succeeded!");
		
			// Step 5: Close connection
			conn.close();
		
		}
		catch(Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}

	}

}
