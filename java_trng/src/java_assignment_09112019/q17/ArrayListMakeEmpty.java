package java_assignment_09112019.q17;

import java.util.List;

public class ArrayListMakeEmpty {
	
	public void ArrayListEmptier(List<String> gameList)
	{
		gameList.clear();
		
		System.out.println("Here's the contents of gameList: ");
		for(String game: gameList)
		{
			System.out.println(game);
		}
		System.out.println("Size of gameList: " + gameList.size());
	}

}
