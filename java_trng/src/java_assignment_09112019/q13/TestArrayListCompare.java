package java_assignment_09112019.q13;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListCompare {

	public static void main(String[] args) {
		
		List<String> colorList1 = new ArrayList<String>(5);
		colorList1.add("Red");
		colorList1.add("Blue");
		colorList1.add("Green");
		colorList1.add("Orange");
		colorList1.add("Violet");
		
		List<String> colorList2 = new ArrayList<String>(5);
		colorList2.add("Red");
		colorList2.add("Blue");
		colorList2.add("Yellow");
		colorList2.add("Orange");
		colorList2.add("Violet");
		
		ArrayListCompare comparecheck = new ArrayListCompare();
		comparecheck.compareArrayLists(colorList1, colorList2);

	}

}
