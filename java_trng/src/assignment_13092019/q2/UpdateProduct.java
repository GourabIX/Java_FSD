package assignment_13092019.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateProduct {
	
	public void productCostUpdater(int productId, int cost)
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
			pst.setInt(1, cost);
			pst.setInt(2, productId);
			
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
	
	public void productNameUpdater(int productId, String productName)
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
			pst.setString(1, productName);
			pst.setInt(2, productId);
			
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

}
