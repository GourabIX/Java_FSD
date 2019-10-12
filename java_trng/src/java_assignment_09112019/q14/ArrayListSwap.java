package java_assignment_09112019.q14;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSwap {
	
	public void swapArrayListIndices(List<String> colorList)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two indices to swap: ");
		try
		{
			Collections.swap(colorList, sc.nextInt(), sc.nextInt());
		}
		catch(Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		System.out.println("Here's the Color List after swapping: ");
		for(String Color: colorList)
		{
			System.out.println(Color);
		}

	}

}
