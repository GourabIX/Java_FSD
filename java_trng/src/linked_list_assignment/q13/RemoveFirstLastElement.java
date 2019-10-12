package linked_list_assignment.q13;

import java.util.List;

public class RemoveFirstLastElement {
	
	public void firstRemover(List<String> colorList)
	{
		colorList.remove(0);
	}
	
	public void lastRemover(List<String> colorList)
	{
		colorList.remove(colorList.size() - 1);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the contents of colorList after modification: ");
		System.out.println(colorList);
	}

}
