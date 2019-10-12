package assignment_10112019.q8;

import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
	
	public void convertHStoTS(Set<String> myHS)
	{
		TreeSet<String> myTS = new TreeSet<String>(myHS);
		
		System.out.println("Here's the content of the TreeSet: ");
		System.out.println(myTS);
	}

}
