package linked_list_assignment.q24;

import java.util.List;

public class CompareLinkedLists {
	
	public boolean compareLists(List<String> list1, List<String> list2) {
		
		return list1.containsAll(list2) ? true : false;
	}
}
