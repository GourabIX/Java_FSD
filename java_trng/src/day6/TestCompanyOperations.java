package day6;

import java.util.HashSet;
import java.util.Set;

import day6.beans.Company;

public class TestCompanyOperations {

	public static void main(String[] args) {
		
		Company company1 = new Company(1001, "Zensar", "Pune");
		Company company2 = new Company(1002, "TCS", "Mumbai");
		Company company3 = new Company(1003, "IBM", "New York");
		
		Set<Company> setOfCompanies = new HashSet<Company>();
		setOfCompanies.add(company1);
		setOfCompanies.add(company2);
		setOfCompanies.add(company3);
		
		CompanySetOperations companies = new CompanySetOperations();
		companies.displayAllCompanies(setOfCompanies);

	}

}
