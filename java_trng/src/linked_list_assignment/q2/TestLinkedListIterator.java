package linked_list_assignment.q2;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListIterator {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		LinkedListIterator iteratorObj = new LinkedListIterator();
		iteratorObj.iterator(colorList);

	}

}
