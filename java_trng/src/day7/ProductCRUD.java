package day7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductCRUD {
		
	public void addProduct(int productId, String productName, float cost)
	{
		try
		{
			// Confirm Load Driver
			System.out.println("Init Success! Driver Loaded successfully!");
				
			// Create Connection
			String url = "jdbc:mysql://localhost:3306/JDBC_db";
			String userName = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established: " + conn);
			
			// Create Prepared Statement
			String sqlQuery = "INSERT INTO Product VALUES(?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
				
			pst.setInt(1, productId);
			pst.setString(2, productName);
			pst.setFloat(3, cost);
				
			// Execute Queries
			int queryFate = pst.executeUpdate();
			if (queryFate == 0)
			{
				System.out.println("Insertion has failed!");
			}
			else
			{
				System.out.println("Insertion succeeded!");
			}
			
			conn.close();
		}
			
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
	}
		
}
