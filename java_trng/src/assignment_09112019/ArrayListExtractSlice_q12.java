package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExtractSlice_q12 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start Index and the end Index to get a slice of colorList: ");
		try
		{
			displayArrayListSlice(colorList, sc.nextInt(), sc.nextInt());
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
	}
	
	public static void displayArrayListSlice(List<String> colorList, int startIndex, int endIndex)
	{
		System.out.println("Here's the colorList slice: ");
		for (int i = startIndex; i <= endIndex; i++)
		{
			System.out.println(colorList.get(i));
		}
	}

}
