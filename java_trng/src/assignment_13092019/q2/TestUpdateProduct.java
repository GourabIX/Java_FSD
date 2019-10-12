package assignment_13092019.q2;

import java.util.Scanner;

public class TestUpdateProduct {

	public static void main(String[] args) {
		
		UpdateProduct updater = new UpdateProduct();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ProductId to update: ");
		int updatePid = sc.nextInt();
		System.out.println("Enter new cost to update: ");
		int cost = sc.nextInt();
		System.out.println("Enter new ProductName: ");
		String productName = sc.next();
		updater.productCostUpdater(updatePid, cost);
		updater.productNameUpdater(updatePid, productName);
		
	}

}
