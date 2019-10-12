package java_assignment_09112019.q4;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListRetrieve {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListRetrieve testRetrieve = new ArrayListRetrieve();
		testRetrieve.retrieveColor(colorList);

	}

}
