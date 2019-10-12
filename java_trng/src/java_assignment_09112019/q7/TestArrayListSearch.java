package java_assignment_09112019.q7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayListSearch {

	public static void main(String[] args) {
		
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
		
		ArrayListSearch arraylist = new ArrayListSearch();
		int search_res = arraylist.searchColor(colorList, searchColor);
		
		if (search_res == -1)
			System.out.println("Color does not exist in colorList.");
		else
			System.out.println("Color found at position: " + search_res);

	}

}
