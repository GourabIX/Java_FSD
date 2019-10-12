package day8_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductOperations {
	
	public int productCostUpdater(Product prod)
	{
		int queryFate = 0;
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
			queryFate = pst.executeUpdate();
			
			// Close connection
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return queryFate;
	}
	
	public int productNameUpdater(Product prod)
	{
		int queryFate = 0;
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
			queryFate = pst.executeUpdate();

			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return queryFate;
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
	
	public int delProduct(Product prod)
	{
		int queryFate = 0;
		try
		{
//			// Confirm Driver Load
//			System.out.println("Driver Loaded successfully!");
//			
//			// Create connection
//			String url = "jdbc:mysql://localhost:3306/JDBC_db";
//			String userName = "root";
//			String userPass = "root";
//			Connection conn = DriverManager.getConnection(url, userName, userPass);
//			System.out.println("Database JDBC_db connected successfully!");
			
			ConnectionUtil connector = new ConnectionUtil();
			Connection conn = connector.createConnection();
			
			// Create Prepared Statement
			String sqlQuery = "DELETE FROM Product WHERE ProductID = ?";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setInt(1, prod.getProductId());
			
			//Execute Queries
			queryFate = pst.executeUpdate();
			
			// Close connection
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return queryFate;
	}

	public Product getProduct(int productID) throws Exception
	{
		Product prod = new Product();
		Connection conn = ConnectionUtil.createConnection();
		String sqlQuery = "SELECT * FROM Product WHERE productId = ?";
		PreparedStatement pst = conn.prepareStatement(sqlQuery);
		pst.setInt(1, productID);
		ResultSet rs = pst.executeQuery();
		while (rs.next())
		{
			productID = rs.getInt("productId");
			String productName = rs.getString("productName");
			int cost = rs.getInt("cost");
			
			prod.setProductId(productID);
			prod.setProductName(productName);
			prod.setCost(cost);
		}
		return prod;
	}

	public List<Product> getAllProducts() throws Exception
	{
		List<Product> listAllProducts = new ArrayList<Product>();
		try
		{
			Connection conn = ConnectionUtil.createConnection();
			System.out.println();
			
			String sqlQuery = "SELECT * FROM Product";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			ResultSet rs = pst.executeQuery();
			while (rs.next())
			{
				int productID = rs.getInt("productId");
				String productName = rs.getString("productName");
				int cost = rs.getInt("cost");
				
				Product prod = new Product(productID, productName, cost);
				listAllProducts.add(prod);
			}
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return listAllProducts;
	}
}
