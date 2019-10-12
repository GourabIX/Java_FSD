package assignment_10112019.q11;

import java.util.HashSet;
import java.util.Set;

public class TestRetainDisplayCommonElements {

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
		
		CompareRetainHashSetElements commonSelector = new CompareRetainHashSetElements();
		commonSelector.retainDisplayCommonElements(gameChars1, gameChars2);

	}

}
