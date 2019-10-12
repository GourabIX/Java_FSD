package java_assignment_09112019.q5;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListUpdate {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListUpdate testReplace = new ArrayListUpdate();
		testReplace.replaceColorAtIndex(colorList);

	}

}
