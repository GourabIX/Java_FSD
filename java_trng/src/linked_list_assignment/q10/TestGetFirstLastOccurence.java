package linked_list_assignment.q10;

import java.util.LinkedList;
import java.util.List;

public class TestGetFirstLastOccurence {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Red");
		colorList.add("Violet");
		colorList.add("Blue");
		
		GetFirstLastOccurence occurenceGetter = new GetFirstLastOccurence();
		occurenceGetter.getFirstOccurence(colorList, "Blue");
		occurenceGetter.getLastOccurence(colorList, "Blue");
		occurenceGetter.getLastOccurence(colorList, "Red");
		occurenceGetter.getFirstOccurence(colorList, "Violet");

	}

}
