package linked_list_assignment.q16;

import java.util.LinkedList;
import java.util.List;

public class TestShuffleElements {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		ShuffleElements toShuffle = new ShuffleElements();
		toShuffle.shuffler(colorList);
		toShuffle.displayLL(colorList);

	}

}
