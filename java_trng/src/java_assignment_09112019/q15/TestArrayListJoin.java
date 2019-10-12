package java_assignment_09112019.q15;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListJoin {

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
		
		ArrayListJoin testJoiner = new ArrayListJoin();
		testJoiner.ArrayListJoiner(gameList, colorList);

	}

}
