// 10. Write a Java program to shuffle elements in an array list.

package assignment_09112019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListShuffle_q10 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Collections.shuffle(colorList);
		
		System.out.println("Here's the Shuffled Color List: ");
		for(String shuffledColor: colorList)
		{
			System.out.println(shuffledColor);
		}

	}

}
