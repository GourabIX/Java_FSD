package linked_list_assignment.q12;

import java.util.LinkedList;
import java.util.List;

public class TestRemoveSpecifiedElement {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		RemoveSpecifiedElement removeHelper = new RemoveSpecifiedElement();
		removeHelper.remover(colorList, 2);
		removeHelper.displayLL(colorList);

	}

}
