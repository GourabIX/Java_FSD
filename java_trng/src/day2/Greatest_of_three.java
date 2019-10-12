package day2;
import java.util.Scanner;

public class Greatest_of_three {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 numbers: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		System.out.println("Greatest number: " + (((n1 > n2) ? n1 : n2) > n3 ? ((n1 > n2) ? n1 : n2) : n3));

	}

}
