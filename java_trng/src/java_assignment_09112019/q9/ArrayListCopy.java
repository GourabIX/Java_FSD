package java_assignment_09112019.q9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopy {
	
	public void copyArrayList(List<String> colorList)
	{
		List<String> copiedColorList = new ArrayList<String>(5);
		for(String color: colorList)
		{
			copiedColorList.add(color);
		}
		
		System.out.println("Here's the new Copied Color List: ");
		for(String copiedColor: copiedColorList)
		{
			System.out.println(copiedColor);
		}
	}

}
