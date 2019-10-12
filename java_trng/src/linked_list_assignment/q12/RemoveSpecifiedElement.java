package linked_list_assignment.q12;

import java.util.List;

public class RemoveSpecifiedElement {
	
	public void remover(List<String> colorList, int pos)
	{
		colorList.remove(pos);
	}
	
	public void displayLL(List<String> colorList)
	{
		System.out.println("Here's the contents of colorList after modification: ");
		System.out.println(colorList);
	}

}
