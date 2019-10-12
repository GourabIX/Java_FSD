package assignment_10112019.q6;

import java.util.HashSet;
import java.util.Set;

public class HashSetCloner {
	
	Set<String> clonedHS = new HashSet<String>();
	
	public void cloneHS(Set<String> myHS)
	{
		clonedHS = (Set<String>) ((HashSet) myHS).clone();
		displayClonedHS(clonedHS);
	}
	
	public void displayClonedHS(Set<String> myHS)
	{
		System.out.println(myHS);
	}

}
