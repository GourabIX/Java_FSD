package day2;
import java.util.Scanner;

public class Marks_if_else {
	
	public static void main(String[] args)
	{
		int mks;
		System.out.println("Enter your marks: ");
		Scanner sc = new Scanner(System.in);
		mks = sc.nextInt();
		
		if (mks < 40)
			System.out.println("Sorry!!! You failed.");
		else
		{
			System.out.println("Congrats!! You passed.");
		
			if (mks > 75)
			{
				System.out.println("Distinction awarded!");
			}
			else if (mks > 60 && mks < 75)
			{
				System.out.println("First Division!");
			}
			else
			{
				System.out.println("Second Division!");
			}
		}
	}

}
