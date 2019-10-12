package day8_2.Example2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import day8_2.Example2.bean.Company;

public class CompanyRepository {
	
	public int addCompany(Company company)
	{
		int queryFate = 0;
		try
		{
			ConnectionUtil connector = new ConnectionUtil();
			Connection conn = connector.createConnection();
			
			String sqlQuery = "INSERT INTO Company VALUES (?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setInt(1, company.getCompanyId());
			pst.setString(2, company.getCompanyName());
			pst.setString(3, company.getLocation());
			
			queryFate = pst.executeUpdate();
			
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return queryFate;
	}
	
	public int delCompany(int companyId)
	{
		int queryFate = 0;
		try
		{
			ConnectionUtil connector = new ConnectionUtil();
			Connection conn = connector.createConnection();
			
			String sqlQuery = "DELETE FROM Company WHERE companyId = ?";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setInt(1, companyId);
			
			queryFate = pst.executeUpdate();
			
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return queryFate;
	}
	
	public int updCompany(Company company)
	{
		int queryFate = 0;
		try
		{
			ConnectionUtil connector = new ConnectionUtil();
			Connection conn = connector.createConnection();
			
			String sqlQuery = "UPDATE Company SET companyName = ?, location = ? WHERE companyId = ?";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setInt(3, company.getCompanyId());
			pst.setString(1, company.getCompanyName());
			pst.setString(2, company.getLocation());
			
			queryFate = pst.executeUpdate();
			
			conn.close();
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		return queryFate;
	}
	
	public void getCompany(int companyId) throws Exception
	{
		try
		{
			ConnectionUtil connector = new ConnectionUtil();
			Connection conn = connector.createConnection();
			
			String sqlQuery = "SELECT * FROM Company WHERE companyId = ?";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			pst.setInt(1, companyId);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				System.out.println("CompanyId = " + rs.getInt("companyId") + ", CompanyName = " + rs.getString("companyName") + ", Location = " + rs.getString("location"));
			}
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
	}
	
	public List<Company> getAllCompanies() throws Exception
	{
		List<Company> listOfCompanies = new ArrayList<Company>();
		try
		{
			ConnectionUtil connector = new ConnectionUtil();
			Connection conn = connector.createConnection();
			
			String sqlQuery = "SELECT * FROM Company";
			PreparedStatement pst = conn.prepareStatement(sqlQuery);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next())
			{
				Company currCompany = new Company();
				currCompany.setCompanyId(rs.getInt("companyId"));
				currCompany.setCompanyName(rs.getString("companyName"));
				currCompany.setLocation(rs.getString("location"));
				
				listOfCompanies.add(currCompany);
			}
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		return listOfCompanies;
	}

}
