// 18. Write a Java program to test an array list is empty or not.

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCheckEmptyness_q18 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		System.out.println("Is gameList empty now? " + gameList.isEmpty());
		
		gameList.clear();
		
		System.out.println("Is gameList empty now? " + gameList.isEmpty());

	}

}
