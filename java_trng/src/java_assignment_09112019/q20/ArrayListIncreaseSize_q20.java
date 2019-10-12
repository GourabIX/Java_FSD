package java_assignment_09112019.q20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIncreaseSize_q20 {
	
	public void increaseArrayListSize(List<String> gameList)
	{
		System.out.println("Size of gameList: " + gameList.size());
		
		((ArrayList<String>) gameList).ensureCapacity(10);
		
		gameList.add("Dying Light");
		gameList.add("Mass Effect 1");
		gameList.add("Dead Space 1");
		
		System.out.println("Size of gameList after increasing capacity size: " + gameList.size());
	}

}
