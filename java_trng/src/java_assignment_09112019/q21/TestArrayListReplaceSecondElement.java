package java_assignment_09112019.q21;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListReplaceSecondElement {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListReplaceSecondElement testReplaceSecondElement = new ArrayListReplaceSecondElement();
		testReplaceSecondElement.replaceSecondElement(colorList);

	}

}
