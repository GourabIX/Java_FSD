// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

package assignment_09112019;

import java.util.List;
import java.util.ArrayList;

public class ArrayListColors_q1 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		System.out.println("Here are the colors stored in the ArrayList: ");
		for (String color: colorList)
		{
			System.out.println(color);
		}

	}

}
