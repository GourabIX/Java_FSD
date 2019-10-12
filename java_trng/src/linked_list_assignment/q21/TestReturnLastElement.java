package linked_list_assignment.q21;

import java.util.LinkedList;
import java.util.List;

public class TestReturnLastElement {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		ReturnLastElement lastReturn = new ReturnLastElement();
		System.out.println("The last element in flowerList is: " + lastReturn.returnLast(flowerList));
		lastReturn.displayLL(flowerList);

	}

}
