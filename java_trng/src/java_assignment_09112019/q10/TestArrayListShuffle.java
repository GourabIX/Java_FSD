package java_assignment_09112019.q10;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListShuffle {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ArrayListShuffle shuffler = new ArrayListShuffle();
		shuffler.shuffledDisplay(colorList);

	}

}
