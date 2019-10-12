package assignment_13092019.q4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetAllProducts {
	
	public void allProductGetter()
	{
		try
		{
			// Confirm Driver Load
			System.out.println("Driver Loaded successfully.");
		
			// Create Connection
			String url = "jdbc:mysql://localhost:3306/JDBC_db";
			String userName = "root";
			String userPass = "root";
			Connection conn = DriverManager.getConnection(url, userName, userPass);
			System.out.println("Connection established: " + conn);
			
			// Create Prepared Statement
			String sqlQuery = "SELECT * FROM Product";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			
			// Execute queries
			ResultSet productDetails = pst.executeQuery();
			System.out.println();
			System.out.println("ProductID       ProductName     Cost");
			while(productDetails.next())
			{
				for(int i = 1; i <= 3; i++)
				{	
					System.out.print(productDetails.getString(i) + "\t" + "\t");
				}
				System.out.println();
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
