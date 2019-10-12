package linked_list_assignment.q6;

import java.util.LinkedList;
import java.util.List;

public class TestInsertAtFirstLast {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		InsertAtFirstLast inserter = new InsertAtFirstLast();
		inserter.insertAtHead(colorList, "Maroon");
		inserter.insertAtHead(colorList, "Aqua");
		inserter.insertAtTail(colorList, "Indigo");
		inserter.displayLL(colorList);

	}

}
