package java_assignment_09112019.q20;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListIncreaseSize_q20 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		ArrayListIncreaseSize_q20 testSizeIncrease = new ArrayListIncreaseSize_q20();
		testSizeIncrease.increaseArrayListSize(gameList);

	}

}
