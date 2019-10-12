package java_assignment_09112019.q22;

import java.util.List;

public class ArrayListPrintUsingPosition {
	
	public void printUsingPosition(List<String> colorList)
	{
		System.out.println("Here's the contents of colorList, according to their index position: ");
		for(int i = 0; i < colorList.size(); i++)
		{
			System.out.println(colorList.get(i));
		}
	}

}
