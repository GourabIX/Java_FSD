package java_assignment_09112019.q4;

import java.util.List;
import java.util.Scanner;

public class ArrayListRetrieve {
	
	public void retrieveColor(List<String> colorList)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index at which you want to retrieve the color: ");
		System.out.println("The color at the specified index is: " + colorList.get(sc.nextInt()));
		sc.close();
	}

}
