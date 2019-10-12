package assignment_10112019.q1;

import java.util.HashSet;
import java.util.Set;

public class TestAppendSpecifiedElementToHS {

	public static void main(String[] args) {
		
		Set<String> gameChars = new HashSet<String>();
		
		AppendSpecifiedElementToHS newElement = new AppendSpecifiedElementToHS();
		newElement.appendToHS(gameChars, "Alan Wake");
		newElement.appendToHS(gameChars, "Max Payne");
		newElement.appendToHS(gameChars, "Geralt of Rivia");
		newElement.appendToHS(gameChars, "Sam Fisher");
		
		System.out.println(gameChars);

	}

}
