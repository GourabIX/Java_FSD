package linked_list_assignment.q11;

import java.util.List;

public class DisplayElementsAndPos {
	
	public void posElementDisplay(List<String> colorList)
	{
		for(int i = 0; i < colorList.size(); i++)
		{
			System.out.println("Element at Position " + (i + 1) + ": " + colorList.get(i));
		}
	}

}
