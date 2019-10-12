package java_assignment_09112019.q21;

import java.util.List;
import java.util.Scanner;

public class ArrayListReplaceSecondElement {
	
	public void replaceSecondElement(List<String> colorList)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the element to replace the Second element of colorList with: ");
		try
		{
			colorList.set(1, colorList.get(sc.nextInt()));
		}
		catch(Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		sc.close();
		
		System.out.println("Here's the contents of colorList after replacement: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}
	}

}
