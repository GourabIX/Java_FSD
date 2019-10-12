package java_assignment_09112019.q12;

import java.util.List;

public class ArrayListExtractSlice {
	
	public void displayArrayListSlice(List<String> colorList, int startIndex, int endIndex)
	{
		System.out.println("Here's the colorList slice: ");
		for (int i = startIndex; i <= endIndex; i++)
		{
			System.out.println(colorList.get(i));
		}
	}

}
