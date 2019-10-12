package java_assignment_09112019.q18;

import java.util.List;

public class ArrayListCheckEmptyness {
	
	public void checkIfEmpty(List<String> gameList)
	{
		System.out.println("Is gameList empty now? " + gameList.isEmpty());
		
		gameList.clear();
		
		System.out.println("Is gameList empty now? " + gameList.isEmpty());
	}

}
