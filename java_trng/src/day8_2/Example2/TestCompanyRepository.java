package day8_2.Example2;

import java.util.ArrayList;
import java.util.List;

import day8_2.Example2.bean.Company;

public class TestCompanyRepository {

	public static void main(String[] args) {
		
		List<Company> someCompanies = new ArrayList<Company>();
		
		Company company1 = new Company(101, "Zensar", "Pune");
		Company company2 = new Company(102, "Qualcomm", "Bengaluru");
		Company company3 = new Company(103, "Google", "Bengaluru");
		Company company4 = new Company(104, "Microsoft", "Bengaluru");
		Company company5 = new Company(105, "Oracle", "Bengaluru");
		Company company6 = new Company(106, "Qualcomm", "Bengaluru");
		
		someCompanies.add(company1);
		someCompanies.add(company2);
		someCompanies.add(company3);
		someCompanies.add(company4);
		someCompanies.add(company5);
		someCompanies.add(company6);
		
		CompanyRepository repoOperations = new CompanyRepository();
		
		for(Company currCompany: someCompanies)
		{
			if (repoOperations.addCompany(currCompany) == 0)
			{
				System.out.println("Operation failed!");
			}
			else
			{
				System.out.println("Operation successful!");
			}
		}
		
		// --------------------
		
		if (repoOperations.delCompany(106) == 0)
		{
			System.out.println("Operation failed!");
		}
		else
		{
			System.out.println("Operation successful!");
		}
		
		// ---------------------
		
		Company companyUpd = new Company(104, "Microsoft", "Pune");
		if (repoOperations.updCompany(companyUpd) == 0)
		{
			System.out.println("Operation failed!");
		}
		else
		{
			System.out.println("Operation successful!");
		}
		
		// ---------------------
		
		try
		{
			System.out.println("\nHere are the company detail for companyId = 101");
			repoOperations.getCompany(101);
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		// ---------------------
		
		List<Company> listOfCompanies = new ArrayList<Company>();
		try
		{
			System.out.println("\nHere are the details for all companies: ");
			listOfCompanies = repoOperations.getAllCompanies();
			
			for (Company currCompany: listOfCompanies)
			{
				System.out.println(currCompany);
			}
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
	}

}
