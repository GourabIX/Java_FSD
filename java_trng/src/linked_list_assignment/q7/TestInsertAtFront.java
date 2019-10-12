package linked_list_assignment.q7;

import java.util.LinkedList;
import java.util.List;

public class TestInsertAtFront {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		InsertAtFront inserter = new InsertAtFront();
		inserter.insertAtHead(colorList, "Turquoise");
		inserter.insertAtHead(colorList, "Black");
		inserter.displayLL(colorList);

	}

}
