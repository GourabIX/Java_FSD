package day6;

import java.util.Set;

import day6.beans.*;

public class CompanySetOperations {
	
	public static void displayAllCompanies(Set<Company> setOfCompanies)
	{
		for(Company company: setOfCompanies)
		{
			System.out.println(company);
		}
	}

}
