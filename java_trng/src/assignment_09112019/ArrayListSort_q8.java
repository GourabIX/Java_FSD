// 8. Write a Java program to sort a given array list. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSort_q8 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		colorList.sort(null);			// sorts alphabetically
		
		System.out.println("Sorted colors: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}
	}

}
