package linked_list_assignment.q13;

import java.util.LinkedList;
import java.util.List;

public class TestRemoveFirstLastElement {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		RemoveFirstLastElement removeHelper = new RemoveFirstLastElement();
		removeHelper.firstRemover(colorList);
		removeHelper.lastRemover(colorList);
		removeHelper.displayLL(colorList);

	}

}
