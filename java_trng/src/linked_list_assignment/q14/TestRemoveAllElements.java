package linked_list_assignment.q14;

import java.util.LinkedList;
import java.util.List;

public class TestRemoveAllElements {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		RemoveAllElements removeHelper = new RemoveAllElements();
		removeHelper.removeAll(colorList);
		removeHelper.getSize(colorList);

	}

}
