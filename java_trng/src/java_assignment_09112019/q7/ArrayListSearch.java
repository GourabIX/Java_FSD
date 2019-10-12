package java_assignment_09112019.q7;

import java.util.List;

public class ArrayListSearch {
	
	public int searchColor(List<String> colorList, String col)
	{
		int index = 0;
		for(String color: colorList)
		{
			index++;
			if (color.equalsIgnoreCase(col))
			{
				return index;
			}
		}
		return -1;
	}

}
