package linked_list_assignment.q4;

import java.util.List;

public class ReverseIterator {
	
	public void reverseIterate(List<String> colorList)
	{
		System.out.println("Printing the Linked List in reverse: ");
		for(int i = colorList.size() - 1; i >= 0; i--)
		{
			System.out.println(colorList.get(i));
		}
	}

}
