package assignment_13092019.q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDelete {
	
	public void deleteProduct(int ProductId)
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
			pst.setInt(1, ProductId);
			
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
