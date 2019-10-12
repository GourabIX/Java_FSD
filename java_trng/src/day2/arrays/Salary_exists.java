package day2.arrays;
import java.util.Scanner;

public class Salary_exists {

	public static void main(String[] args) {
		
		int sal_arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < sal_arr.length; i++)
		{
			System.out.println("Enter salary: ");
			sal_arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the salary amount to check if it exists: ");
		int sal_to_find = sc.nextInt();
		
		boolean sal_ff = false;
		
		for (int i = 0; i < sal_arr.length; i++)
		{
			if (sal_to_find == sal_arr[i])
			{
				System.out.println("Found!");
				sal_ff = true;
				break;
			}
		}
		
		if (sal_ff == false)
			System.out.println("Not Found!");
		
	}

}
