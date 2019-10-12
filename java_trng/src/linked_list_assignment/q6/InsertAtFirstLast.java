package linked_list_assignment.q6;

import java.util.List;

public class InsertAtFirstLast {
	
	public void insertAtHead(List<String> colorList, String element)
	{
		colorList.add(0, element);
	}
	
	public void insertAtTail(List<String> colorList, String element)
	{
		colorList.add(element);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the modified Linked List: ");
		System.out.println(colorList);
	}

}
