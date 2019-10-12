package linked_list_assignment.q23;

import java.util.ArrayList;
import java.util.List;

public class LinkedListToArrayList {
	
	public ArrayList<String> convertLLToAL(List<String> flowerList)
	{
		List<String> flowerArrayList = new ArrayList<String> (flowerList);
		return (ArrayList<String>) flowerArrayList;
	}

}
