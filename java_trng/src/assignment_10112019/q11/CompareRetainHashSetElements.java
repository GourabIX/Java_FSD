package assignment_10112019.q11;

import java.util.HashSet;
import java.util.Set;

public class CompareRetainHashSetElements {
	
	public void retainDisplayCommonElements(Set<String> gameChars1, Set<String> gameChars2)
	{
		gameChars1.retainAll(gameChars2);
		System.out.println(gameChars1);		
	}

}
