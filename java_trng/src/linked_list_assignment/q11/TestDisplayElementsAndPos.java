package linked_list_assignment.q11;

import java.util.LinkedList;
import java.util.List;

public class TestDisplayElementsAndPos {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		DisplayElementsAndPos displayer = new DisplayElementsAndPos();
		displayer.posElementDisplay(colorList);

	}

}
