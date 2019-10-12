package linked_list_assignment.q26;

import java.util.List;

public class ReplaceElement {
	
	public void replaceElement(List<String> list, int indexToReplace, String replaceWith)
	{
		try
		{
			list.set(indexToReplace, replaceWith);
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
	}
	
	public void listPrint(List<String> list)
	{
		System.out.println("Here's the contents of the modified LinkedList: ");
		System.out.println(list);
	}

}
