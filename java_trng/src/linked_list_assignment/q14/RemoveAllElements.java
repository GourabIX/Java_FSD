package linked_list_assignment.q14;

import java.util.List;

public class RemoveAllElements {
	
	public void removeAll(List<String> colorList)
	{
		colorList.removeAll(colorList);
	}
	
	public void getSize(List<String> colorList)
	{
		System.out.println("Current size of colorList: " + colorList.size());
	}

}
