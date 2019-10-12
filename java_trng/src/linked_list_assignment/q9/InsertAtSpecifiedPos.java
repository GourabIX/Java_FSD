package linked_list_assignment.q9;

import java.util.List;

public class InsertAtSpecifiedPos {
	
	public void insertAtPos(List<String> colorList, int pos, String element)
	{
		colorList.add(pos, element);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the modified Linked List: ");
		System.out.println(colorList);
	}

}
