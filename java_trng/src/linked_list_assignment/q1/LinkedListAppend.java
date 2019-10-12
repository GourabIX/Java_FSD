package linked_list_assignment.q1;

import java.util.List;

public class LinkedListAppend {
	
	public void appendToLL(List<String> colorList)
	{
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the contents of the Linked List: ");
		System.out.println(colorList);
	}

}
