package java_assignment_09112019.q1;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListColors_q1 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListColors_q1 color_obj = new ArrayListColors_q1();
		color_obj.displayList(colorList);

	}

}
