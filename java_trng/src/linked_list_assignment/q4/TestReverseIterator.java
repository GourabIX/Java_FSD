package linked_list_assignment.q4;

import java.util.LinkedList;
import java.util.List;

public class TestReverseIterator {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ReverseIterator revIterator = new ReverseIterator();
		revIterator.reverseIterate(colorList);

	}

}
