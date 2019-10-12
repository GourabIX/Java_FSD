package assignment_10112019.q12;

import java.util.HashSet;
import java.util.Set;

public class TestClearHashSet {

	public static void main(String[] args) {
		
		Set<String> gameChars1 = new HashSet<String>();
		gameChars1.add("Geralt of Rivia");
		gameChars1.add("Sam Fisher");
		gameChars1.add("Ezio Auditore");
		gameChars1.add("Alan Wake");
		gameChars1.add("Max Payne");
		gameChars1.add("Booker DeWitt");
		
		ClearHashSet cleaner = new ClearHashSet();
		cleaner.cleanHashSet(gameChars1);

	}

}
