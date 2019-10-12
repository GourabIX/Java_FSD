package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductOperations {
	
	public void productCostUpdater(Product prod)
	{
		try
		{
			// Driver Load confirmation
			System.out.println("Driver Loaded successfully.");
		
			// Create Connection
			String url = "jdbc:mysql://localhost:3306/JDBC_db";
			String userName = "root";
			String userPass = "root";
			Connection conn = DriverManager.getConnection(url, userName, userPass);
			System.out.println("Connection Established: " + conn);
			
			// Create Prepared Statement
			String sqlQuery = "UPDATE Product SET COST = ? WHERE ProductId = ?";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setInt(1, prod.getCost());
			pst.setInt(2, prod.getProductId());
			
			// Execute Queries
			int queryFate = pst.executeUpdate();
			if (queryFate == 0)
				System.out.println("Cost Updation failed!");
			else
				System.out.println("Cost Updation Successful.");
			
			// Close connection
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
	}
	
	public void productNameUpdater(Product prod)
	{
		try
		{
			// Driver Load confirmation
			System.out.println("Driver Loaded successfully.");
		
			// Create Connection
			String url = "jdbc:mysql://localhost:3306/JDBC_db";
			String userName = "root";
			String userPass = "root";
			Connection conn = DriverManager.getConnection(url, userName, userPass);
			System.out.println("Connection Established: " + conn);
			
			// Create Prepared Statement
			String sqlQuery = "UPDATE Product SET ProductName = ? WHERE ProductId = ?";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setString(1, prod.getProductName());
			pst.setInt(2, prod.getProductId());
			
			// Execute Queries
			int queryFate = pst.executeUpdate();
			if (queryFate == 0)
				System.out.println("ProductName Updation failed!");
			else
				System.out.println("ProductName Updation Successful.");
			
			// Close connection
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
	}
	
	public int addProduct(Product prod)
	{
		int queryFate = 0;
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
				
			pst.setInt(1, prod.getProductId());
			pst.setString(2, prod.getProductName());
			pst.setFloat(3, prod.getCost());
				
			// Execute Queries
			queryFate = pst.executeUpdate();
			
			conn.close();
		}
			
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return queryFate;
	}
	
	public void delProduct(Product prod)
	{
		try
		{
			// Confirm Driver Load
			System.out.println("Driver Loaded successfully!");
			
			// Create connection
			String url = "jdbc:mysql://localhost:3306/JDBC_db";
			String userName = "root";
			String userPass = "root";
			Connection conn = DriverManager.getConnection(url, userName, userPass);
			System.out.println("Database JDBC_db connected successfully!");
			
			// Create Prepared Statement
			String sqlQuery = "DELETE FROM Product WHERE ProductID = ?";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setInt(1, prod.getProductId());
			
			//Execute Queries
			int queryFate = pst.executeUpdate();
			if (queryFate == 1)
			{
				System.out.println("Deletion succeeded!");
			}
			else
			{
				System.out.println("Deletion failed!");
			}
			
			// Close connection
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
	}

}
