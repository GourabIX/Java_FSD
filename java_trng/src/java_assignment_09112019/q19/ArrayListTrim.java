package java_assignment_09112019.q19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTrim {
	
	public void trimmer(List<String> gameList)
	{
		System.out.println("Size of gameList before trimming: " + gameList.size());
		
		((ArrayList<String>) gameList).trimToSize();
		
		System.out.println("Size of gameList after trimming: " + gameList.size());
	}

}
