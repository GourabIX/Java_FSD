package linked_list_assignment.q8;

import java.util.LinkedList;
import java.util.List;

public class TestInsertAtEnd {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		InsertAtEnd inserter = new InsertAtEnd();
		inserter.insertAtTail(colorList, "Indigo");
		inserter.displayLL(colorList);

	}

}
