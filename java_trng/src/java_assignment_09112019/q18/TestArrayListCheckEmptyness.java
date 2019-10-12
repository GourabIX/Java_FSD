package java_assignment_09112019.q18;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListCheckEmptyness {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		ArrayListCheckEmptyness emptyChecker = new ArrayListCheckEmptyness();
		emptyChecker.checkIfEmpty(gameList);

	}

}
