package assignment_10112019.q7;

import java.util.Set;

public class HashSetToArray {
	
	public void hsToArr(Set<String> myHS)
	{
		String[] gameArr = new String[myHS.size()];
		
		myHS.toArray(gameArr);
		
		for (String game: gameArr)
		{
			System.out.println(game);
		}
	}

}
