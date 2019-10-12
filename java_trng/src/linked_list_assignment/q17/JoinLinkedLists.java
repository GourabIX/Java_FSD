package linked_list_assignment.q17;

import java.util.List;

public class JoinLinkedLists {
	
	public void joinLL(List<String> colorList, List<String> flowerList)
	{
		flowerList.addAll(colorList);
	}
	
	public void displayLL(List<String> joinedList)
	{
		System.out.println("Here's the contents of the joined linked list: ");
		System.out.println(joinedList);
	}
}
