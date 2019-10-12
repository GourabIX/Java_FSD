package linked_list_assignment.q19;

import java.util.List;

public class RemoveReturnFirstElementLL {
	
	public String removeReturnfirstElement(List<String> flowerList)
	{
		String flowerName = flowerList.get(0);
		flowerList.remove(0);
		return flowerName;
		
	}
	
	public void displayLL(List<String> flowerList)
	{
		System.out.println("Here's the contents of the modified linked list: ");
		System.out.println(flowerList);
	}

}
