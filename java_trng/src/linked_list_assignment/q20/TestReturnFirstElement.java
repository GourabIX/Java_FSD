package linked_list_assignment.q20;

import java.util.LinkedList;
import java.util.List;

public class TestReturnFirstElement {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		ReturnFirstElement firstReturn = new ReturnFirstElement();
		System.out.println("The first element in flowerList is: " + firstReturn.returnFirst(flowerList));
		firstReturn.displayLL(flowerList);

	}

}
