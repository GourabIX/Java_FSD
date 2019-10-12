package assignment_10112019.q10;

import java.util.HashSet;
import java.util.Set;

public class TestCompareHashSets {

	public static void main(String[] args) {
		
		Set<String> gameChars1 = new HashSet<String>();
		gameChars1.add("Geralt of Rivia");
		gameChars1.add("Sam Fisher");
		gameChars1.add("Ezio Auditore");
		gameChars1.add("Alan Wake");
		gameChars1.add("Max Payne");
		gameChars1.add("Booker DeWitt");
		
		Set<String> gameChars2 = new HashSet<String>();
		gameChars2.add("Geralt of Rivia");
		gameChars2.add("Sam Fisher");
		gameChars2.add("Ezio Auditore");
		gameChars2.add("Alan Wake");
		gameChars2.add("Max Payne");
		gameChars2.add("Booker DeWitt");
		
		CompareHashSets comparator = new CompareHashSets();
		comparator.hashSetComparator(gameChars1, gameChars2);

	}

}
