package java_assignment_09112019.q6;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListRemove {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListRemove testRemoveAtIndex = new ArrayListRemove();
		testRemoveAtIndex.removeColorAtIndex(colorList);

	}

}
