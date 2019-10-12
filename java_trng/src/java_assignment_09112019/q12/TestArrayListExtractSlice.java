package java_assignment_09112019.q12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayListExtractSlice {

	public static void main(String[] args) {
		
		List<String> colorList = new ArrayList<String>(5);
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Orange");
		colorList.add("Violet");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start Index and the end Index to get a slice of colorList: ");
		ArrayListExtractSlice arraylist = new ArrayListExtractSlice();
		try
		{
			arraylist.displayArrayListSlice(colorList, sc.nextInt(), sc.nextInt());
		}
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}

	}

}
