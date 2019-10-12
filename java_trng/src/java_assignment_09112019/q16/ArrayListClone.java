package java_assignment_09112019.q16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClone {
	
	public void displayClonedArrayList(List<String> gameList)
	{
		List<String> gameListClone = new ArrayList<String>();
		gameListClone.addAll(gameList);
		
		System.out.println("Here's the contents of the Clone of gameList: ");
		for(String game: gameListClone)
		{
			System.out.println(game);
		}
	}

}
