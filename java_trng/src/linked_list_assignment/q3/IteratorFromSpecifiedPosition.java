package linked_list_assignment.q3;

import java.util.List;

public class IteratorFromSpecifiedPosition {
	
	public void iteratorSpecificPos(List<String> colorList, int startPos)
	{
		System.out.println("Here's the slice of the Linked List: ");
		for(int i = startPos; i < colorList.size(); i++)
		{
			System.out.println(colorList.get(i));
		}
	}

}
