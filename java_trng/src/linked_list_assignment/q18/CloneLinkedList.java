package linked_list_assignment.q18;

import java.util.List;

public class CloneLinkedList {
	
	public void joinLL(List<String> flowerList, List<String> clonedFlowerList)
	{
		clonedFlowerList.addAll(flowerList);
	}
	
	public void displayLL(List<String> clonedList)
	{
		System.out.println("Here's the contents of the cloned linked list: ");
		System.out.println(clonedList);
	}

}
