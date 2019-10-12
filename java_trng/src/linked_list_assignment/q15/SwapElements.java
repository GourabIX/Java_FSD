package linked_list_assignment.q15;

import java.util.Collections;
import java.util.List;

public class SwapElements {
	
	public void elementSwapper(List<String> colorList, int swapSrc, int swapDest)
	{
		Collections.swap(colorList, swapSrc, swapDest);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the Linked List after swapping: ");
		System.out.println(colorList);
	}

}
