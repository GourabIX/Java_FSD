package linked_list_assignment.q16;

import java.util.Collections;
import java.util.List;

public class ShuffleElements {
	
	public void shuffler(List<String> colorList)
	{
		Collections.shuffle(colorList);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the Linked List after shuffling: ");
		System.out.println(colorList);
	}


}
