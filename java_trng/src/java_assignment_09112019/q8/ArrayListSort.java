package java_assignment_09112019.q8;

import java.util.List;

public class ArrayListSort {
	
	public void displaySorted(List<String> colorList)
	{
		colorList.sort(null);			// sorts alphabetically
		
		System.out.println("Sorted colors: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}
	}

}
