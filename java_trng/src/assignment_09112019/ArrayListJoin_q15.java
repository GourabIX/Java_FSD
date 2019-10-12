// 15. Write a Java program to join two array lists. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJoin_q15 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		List<String> gameList = new ArrayList<String>(3);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Prince of Persia: Two Thrones");
		
		gameList.addAll(colorList);
		
		System.out.println("Here's the contents of gameList which has been joined with colorList: ");
		for(String listElement: gameList)
		{
			System.out.println(listElement);
		}

	}

}
