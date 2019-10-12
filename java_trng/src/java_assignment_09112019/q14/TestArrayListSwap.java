package java_assignment_09112019.q14;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListSwap {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListSwap swapper = new ArrayListSwap();
		swapper.swapArrayListIndices(colorList);

	}

}
