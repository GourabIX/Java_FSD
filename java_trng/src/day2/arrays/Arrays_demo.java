package day2.arrays;
import java.util.Scanner;

public class Arrays_demo {

	public static void main(String[] args) {
		int arr[] = {69, 85, 66, 80, 81};
		int sum = 0;
		
		System.out.println("Array contents: ");
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			// System.out.println(arr[i]);
		}
		System.out.println("Array Sum: " + sum);
		
		int arr2[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println("Enter a number to store: ");
			arr2[i] = sc.nextInt();
		}
		
		int sum2 = 0;
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
			sum2 += arr2[i];
		}
		System.out.println("Dynamic Array Sum: " + sum2);
		
		
	}

}
