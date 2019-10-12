// 21. Write a Java program to replace the second element of an arrayList with the specified element.

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListReplaceSecondElement {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
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
		
		System.out.println("Here's the contents of colorList after replacement: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}
		

	}

}
