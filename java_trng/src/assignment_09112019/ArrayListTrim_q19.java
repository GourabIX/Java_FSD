package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTrim_q19 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(10);
		gameList.add("The Witcher 3: Wild Hunt");
		gameList.add("Alan Wake");
		gameList.add("Resident Evil: 2");
		gameList.add("Prince of Persia: The Two Thrones");
		gameList.add("Watch_Dogs 1");
		
		System.out.println("Size of gameList before trimming: " + gameList.size());
		
		((ArrayList<String>) gameList).trimToSize();
		
		System.out.println("Size of gameList after trimming: " + gameList.size());

	}

}
