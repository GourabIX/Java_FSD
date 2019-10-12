package linked_list_assignment.q5;

import java.util.List;

public class InsertElementAtSpecifiedPos {
	
	public void inserterSpecificPos(String element, int pos, List<String> colorList)
	{
		colorList.add(pos, element);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the modified Linked List: ");
		System.out.println(colorList);
	}

}
