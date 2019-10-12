package assignment_10112019.q8;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetToTreeSet {

	public static void main(String[] args) {
		
		Set<String> gameChars = new HashSet<String>();
		gameChars.add("Geralt of Rivia");
		gameChars.add("Sam Fisher");
		gameChars.add("Ezio Auditore");
		gameChars.add("Alan Wake");
		gameChars.add("Max Payne");
		gameChars.add("Booker DeWitt");
		
		HashSetToTreeSet converter = new HashSetToTreeSet();
		converter.convertHStoTS(gameChars);

	}

}
