// 16. Write a Java program to clone an array list to another array list. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClone_q16 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		List<String> gameListClone = new ArrayList<String>();
		gameListClone.addAll(gameList);
		
		System.out.println("Here's the contents of the Clone of gameList: ");
		for(String game: gameListClone)
		{
			System.out.println(game);
		}

	}

}
