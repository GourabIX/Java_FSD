package assignment_10112019.q5;

import java.util.HashSet;
import java.util.Set;

public class TestCheckHashSetEmptyStatus {

	public static void main(String[] args) {
		
		Set<String> gameChars = new HashSet<String>();
		gameChars.add("Geralt of Rivia");
		gameChars.add("Sam Fisher");
		gameChars.add("Ezio Auditore");
		gameChars.add("Alan Wake");
		gameChars.add("Max Payne");
		gameChars.add("Booker DeWitt");
		
		Set<String> emptyHS = new HashSet<String>();
		
		CheckHashSetEmptyStatus emptyChecker = new CheckHashSetEmptyStatus();
		System.out.println("Is gameChars empty? " + emptyChecker.emptyStatus(gameChars));
		System.out.println("Is emptyHS empty? " + emptyChecker.emptyStatus(emptyHS));

	}

}
