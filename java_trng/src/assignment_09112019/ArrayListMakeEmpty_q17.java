// 17. Write a Java program to empty an array list.

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMakeEmpty_q17 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		gameList.clear();
		
		System.out.println("Here's the contents of gameList: ");
		for(String game: gameList)
		{
			System.out.println(game);
		}
		System.out.println("Size of gameList: " + gameList.size());
		

	}

}
