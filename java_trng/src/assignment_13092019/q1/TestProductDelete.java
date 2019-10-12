package assignment_13092019.q1;

import java.util.Scanner;

public class TestProductDelete {

	public static void main(String[] args) {
		
		ProductDelete deleteProd = new ProductDelete();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ProductId to delete: ");
		int deletePid = sc.nextInt();
		deleteProd.deleteProduct(deletePid);

	}

}
