package java_assignment_09112019.q15;

import java.util.List;

public class ArrayListJoin {
	
	public void ArrayListJoiner(List<String> gameList, List<String> colorList)
	{
		gameList.addAll(colorList);
		
		System.out.println("Here's the contents of gameList which has been joined with colorList: ");
		for(String listElement: gameList)
		{
			System.out.println(listElement);
		}
	}

}
