package assignment_10112019.q9;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetToArrayList {

	public static void main(String[] args) {
		
		Set<String> gameChars = new HashSet<String>();
		gameChars.add("Geralt of Rivia");
		gameChars.add("Sam Fisher");
		gameChars.add("Ezio Auditore");
		gameChars.add("Alan Wake");
		gameChars.add("Max Payne");
		gameChars.add("Booker DeWitt");
		
		HashSetToArrayList converter = new HashSetToArrayList();
		converter.hashSetToArrayListConverter(gameChars);

	}

}
