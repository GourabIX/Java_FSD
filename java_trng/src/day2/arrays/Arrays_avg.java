package day2.arrays;
import java.util.Scanner;

public class Arrays_avg {

	public static void main(String[] args) {
		
		int ages[] = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < ages.length; i++)
		{
			System.out.println("Enter age: ");
			ages[i] = sc.nextInt();
		}
		
		float sum = 0;
		for(int i = 0; i < ages.length; i++)
		{
			sum += ages[i];
		}
		
		System.out.println("Average Age: " + sum / ages.length);
		
	}

}
