// 11. Write a Java program to reverse elements in an array list.

package assignment_09112019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReverse_q11 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Collections.reverse(colorList);
		
		System.out.println("Here's the Reversed Color List: ");
		for(String reversedColor: colorList)
		{
			System.out.println(reversedColor);
		}

	}

}
