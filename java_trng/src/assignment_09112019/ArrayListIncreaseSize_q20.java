// 20. Write a Java program to increase the size of an array list.

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIncreaseSize_q20 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		System.out.println("Size of gameList: " + gameList.size());
		
		((ArrayList<String>) gameList).ensureCapacity(10);
		
		gameList.add("Dying Light");
		gameList.add("Mass Effect 1");
		gameList.add("Dead Space 1");
		
		System.out.println("Size of gameList after increasing capacity size: " + gameList.size());
	}

}
