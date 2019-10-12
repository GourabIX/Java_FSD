package linked_list_assignment.q17;

import java.util.LinkedList;
import java.util.List;

public class TestJoinLinkedLists {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		
		JoinLinkedLists joinDisplay = new JoinLinkedLists();
		joinDisplay.joinLL(colorList, flowerList);
		joinDisplay.displayLL(flowerList);

	}

}
