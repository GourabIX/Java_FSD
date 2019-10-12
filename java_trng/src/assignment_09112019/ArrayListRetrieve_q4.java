// 4. Write a Java program to retrieve an element (at a specified index) from a given array list. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListRetrieve_q4 {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index at which you want to retrieve the color: ");
		System.out.println("The color at the specified index is: " + colorList.get(sc.nextInt()));
		sc.close();

	}

}
