package java_assignment_09112019.q11;

import java.util.Collections;
import java.util.List;

public class ArrayListReverse {
	
	public void reverseArrayList(List<String> colorList)
	{
		Collections.reverse(colorList);
		
		System.out.println("Here's the Reversed Color List: ");
		for(String reversedColor: colorList)
		{
			System.out.println(reversedColor);
		}
	}

}
