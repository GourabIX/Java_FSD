package linked_list_assignment.q7;

import java.util.List;

public class InsertAtFront {
	
	public void insertAtHead(List<String> colorList, String element)
	{
		colorList.add(0, element);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the modified Linked List: ");
		System.out.println(colorList);
	}


}
