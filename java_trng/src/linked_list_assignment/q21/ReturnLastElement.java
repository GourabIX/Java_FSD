package linked_list_assignment.q21;

import java.util.List;

public class ReturnLastElement {
	
	public String returnLast(List<String> flowerList)
	{
		return flowerList.get(flowerList.size() - 1);
	}
	
	public void displayLL(List<String> flowerList)
	{
		System.out.println("Here's the contents of the modified linked list: ");
		System.out.println(flowerList);
	}

}
