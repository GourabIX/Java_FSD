package assignment_10112019.q6;

import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class TestHashSetCloner {

	public static void main(String[] args) {
		
		Set<String> gameChars = new HashSet<String>();
		gameChars.add("Geralt of Rivia");
		gameChars.add("Sam Fisher");
		gameChars.add("Ezio Auditore");
		gameChars.add("Alan Wake");
		gameChars.add("Max Payne");
		gameChars.add("Booker DeWitt");
		
		HashSetCloner cloner = new HashSetCloner();
		cloner.cloneHS(gameChars);

	}

}
