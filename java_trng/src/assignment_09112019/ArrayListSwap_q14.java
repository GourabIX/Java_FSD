// 14. Write a Java program of swap two elements in an array list. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListSwap_q14 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two indices to swap: ");
		try
		{
			Collections.swap(colorList, sc.nextInt(), sc.nextInt());
		}
		catch(Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		System.out.println("Here's the Color List after swapping: ");
		for(String Color: colorList)
		{
			System.out.println(Color);
		}

	}

}
