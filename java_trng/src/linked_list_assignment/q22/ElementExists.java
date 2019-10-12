package linked_list_assignment.q22;

import java.util.List;

public class ElementExists {
	
	public boolean checkElementExistence(List<String> flowerList, String element)
	{
		for(String flower: flowerList)
		{
			if (flower.equalsIgnoreCase(element))
			{
				return true;
			}
		}
		
		return false;
	}

}
