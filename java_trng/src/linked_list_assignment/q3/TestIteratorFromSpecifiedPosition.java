package linked_list_assignment.q3;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class TestIteratorFromSpecifiedPosition {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		IteratorFromSpecifiedPosition iterator = new IteratorFromSpecifiedPosition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position from which to start the iteration: ");
		iterator.iteratorSpecificPos(colorList, sc.nextInt());
		sc.close();

	}

}
