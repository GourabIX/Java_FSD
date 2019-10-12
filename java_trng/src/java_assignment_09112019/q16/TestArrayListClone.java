package java_assignment_09112019.q16;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListClone {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		ArrayListClone cloner = new ArrayListClone();
		cloner.displayClonedArrayList(gameList);

	}

}
