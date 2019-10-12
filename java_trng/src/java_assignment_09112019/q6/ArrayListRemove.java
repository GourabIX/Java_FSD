package java_assignment_09112019.q6;

import java.util.List;
import java.util.Scanner;

public class ArrayListRemove {
	
	public void removeColorAtIndex(List<String> colorList)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index at which you want to remove the color: ");
		int removeAtIndex = sc.nextInt();
		colorList.remove(removeAtIndex);
		sc.close();
		
		System.out.println("Here's the colors ArrayList: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}
	}

}
