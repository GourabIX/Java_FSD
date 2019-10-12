// 9. Write a Java program to copy one array list into another.

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopy_q9 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		List<String> copiedColorList = new ArrayList<String>(5);
		for(String color: colorList)
		{
			copiedColorList.add(color);
		}
		
		System.out.println("Here's the new Copied Color List: ");
		for(String copiedColor: copiedColorList)
		{
			System.out.println(copiedColor);
		}
	}

}
