// 5. Write a Java program to update specific array element by given element. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListUpdate_q5 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index at which you want to update the color: ");
		int updateAtIndex = sc.nextInt();
		System.out.println("Enter the color by which you want to replace the current color: ");
		String updateToColor = sc.next();
		colorList.set(updateAtIndex, updateToColor);
		sc.close();
		
		System.out.println("Here's the colors ArrayList: ");
		for(String color: colorList)
		{
			System.out.println(color);
		}

	}

}
