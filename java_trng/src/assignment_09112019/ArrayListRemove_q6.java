// 6. Write a Java program to remove the third element from an array list. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListRemove_q6 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index at which you want to remove the color: ");
		int removeAtIndex = sc.nextInt();
		colorList.remove(removeAtIndex);
		sc.close();
		
		System.out.println("Here's the colors ArrayList: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}

	}

}
