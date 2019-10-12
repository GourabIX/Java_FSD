// 7. Write a Java program to search an element in an array list. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSearch_q7 {

	public static void main(String[] args) 
	{
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color for which you want to search the colorList: ");
		String searchColor = sc.next();
		sc.close();
		
		int search_res = searchColor(colorList, searchColor);
		
		if (search_res == -1)
			System.out.println("Color does not exist in colorList.");
		else
			System.out.println("Color found at position: " + search_res);
		
	}
	
	public static int searchColor(List<String> colorList, String col)
	{
		int index = 0;
		for(String color: colorList)
		{
			index++;
			if (color.equalsIgnoreCase(col))
			{
				return index;
			}
		}
		return -1;
	}

}
