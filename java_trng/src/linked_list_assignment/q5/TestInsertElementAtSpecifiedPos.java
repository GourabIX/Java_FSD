package linked_list_assignment.q5;

import java.util.LinkedList;
import java.util.List;

public class TestInsertElementAtSpecifiedPos {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		InsertElementAtSpecifiedPos insertDisplay = new InsertElementAtSpecifiedPos();
		insertDisplay.inserterSpecificPos("Teal", 2, colorList);
		insertDisplay.displayLL(colorList);

	}

}
