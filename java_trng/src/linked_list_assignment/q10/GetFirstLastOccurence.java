package linked_list_assignment.q10;

import java.util.List;

public class GetFirstLastOccurence {
	
	public void getFirstOccurence(List<String> colorList, String element)
	{
		System.out.println("First Occurence of " + element + ": " + colorList.indexOf(element));
	}
	
	public void getLastOccurence(List<String> colorList, String element)
	{
		System.out.println("Last Occurence of " + element + ": " + colorList.lastIndexOf(element));
	}
	
}
