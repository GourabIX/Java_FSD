package java_assignment_09112019.q19;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListTrim {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(10);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		ArrayListTrim trim = new ArrayListTrim();
		trim.trimmer(gameList);

	}

}
