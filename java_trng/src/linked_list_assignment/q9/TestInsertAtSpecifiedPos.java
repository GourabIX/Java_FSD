package linked_list_assignment.q9;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestInsertAtSpecifiedPos {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		InsertAtSpecifiedPos inserter = new InsertAtSpecifiedPos();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to enter? ");
		int numElements = sc.nextInt();
		System.out.println("Enter the position to enter these elements at: ");
		int posElements = sc.nextInt();
		for (int i = 0; i < numElements; i++) {
			System.out.println("Enter a string to enter: ");
			inserter.insertAtPos(colorList, posElements, sc.next());
		}
		inserter.displayLL(colorList);

	}

}
