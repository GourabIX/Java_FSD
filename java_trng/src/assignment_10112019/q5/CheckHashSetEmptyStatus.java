package assignment_10112019.q5;

import java.util.Set;

public class CheckHashSetEmptyStatus {
	
	public boolean emptyStatus(Set<String> myHS)
	{
		if (myHS.isEmpty())
			return true;
		else
		{
			System.out.println("HashSet is not Empty. Current size: " + myHS.size());
			return false;
		}
	}

}
