package java_assignment_09112019.q5;

import java.util.List;
import java.util.Scanner;

public class ArrayListUpdate {
	
	public void replaceColorAtIndex(List<String> colorList)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index at which you want to update the color: ");
		int updateAtIndex = sc.nextInt();
		System.out.println("Enter the color by which you want to replace the current color: ");
		String updateToColor = sc.next();
		colorList.set(updateAtIndex, updateToColor);
		sc.close();
		
		System.out.println("Here's the colors ArrayList: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}

	}

}
