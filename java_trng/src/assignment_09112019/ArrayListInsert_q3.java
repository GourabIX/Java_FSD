// 3. Write a Java program to insert an element into the array list at the first position. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListInsert_q3 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the color which you want at the first position: ");
		colorList.add(0, sc.next());
		sc.close();
		
		System.out.println("Here's the colors ArrayList: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}

	}

}
