// 22. Write a Java program to print all the elements of an arrayList using the position of the elements.

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrintUsingPosition {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		System.out.println("Here's the contents of colorList, according to their index position: ");
		for(int i = 0; i < colorList.size(); i++)
		{
			System.out.println(colorList.get(i));
		}

	}

}
