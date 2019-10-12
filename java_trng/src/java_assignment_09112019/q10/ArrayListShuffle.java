package java_assignment_09112019.q10;

import java.util.Collections;
import java.util.List;

public class ArrayListShuffle {
	
	public void shuffledDisplay(List<String> colorList)
	{
		Collections.shuffle(colorList);
		
		System.out.println("Here's the Shuffled Color List: ");
		for(String shuffledColor: colorList)
		{
			System.out.println(shuffledColor);
		}
	}

}
