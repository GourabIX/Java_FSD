package java_assignment_09112019.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayListInsert_q3 {

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
		
		ArrayListInsert_q3 testInsert = new ArrayListInsert_q3();
		testInsert.displayList(colorList);

	}

}
