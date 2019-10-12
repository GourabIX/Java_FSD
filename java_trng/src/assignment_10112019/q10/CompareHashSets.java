package assignment_10112019.q10;

import java.util.HashSet;
import java.util.Set;

public class CompareHashSets {
	
	public void hashSetComparator(Set<String> gameChars1, Set<String> gameChars2)
	{
		if (gameChars1.equals(gameChars2))
		{
			System.out.println("The two HashSets are equal.");
		}
		else
		{
			System.out.println("The two HashSets are not equal.");
		}
	}

}
