package assignment_10112019.q9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HashSetToArrayList {
	
	public void hashSetToArrayListConverter(Set<String> myHS)
	{
		List<String> myArrayList = new ArrayList<String>(myHS);
		
		for(String currGame: myArrayList)
		{
			System.out.println(currGame);
		}
	}
	
}
