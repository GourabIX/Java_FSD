package java_assignment_09112019.q8;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListSort {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListSort arraylist = new ArrayListSort();
		arraylist.displaySorted(colorList);

	}

}
