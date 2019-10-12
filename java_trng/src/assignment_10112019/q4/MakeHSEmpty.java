package assignment_10112019.q4;

import java.util.Set;

public class MakeHSEmpty {
	
	public void hsCleaner(Set<String> myHS)
	{
		myHS.clear();
		System.out.println("HashSet cleared");
		System.out.println("Size of HashSet after clearing: " + myHS.size());
	}

}
