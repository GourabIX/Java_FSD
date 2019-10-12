package linked_list_assignment.q15;

import java.util.LinkedList;
import java.util.List;

public class TestSwapElements {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		SwapElements swapper = new SwapElements();
		swapper.elementSwapper(colorList, 1, 3);
		swapper.displayLL(colorList);

	}

}
