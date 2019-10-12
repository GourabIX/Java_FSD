package linked_list_assignment.q19;

import java.util.LinkedList;
import java.util.List;

public class TestRemoveReturnFirstElementLL {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		RemoveReturnFirstElementLL firstElem = new RemoveReturnFirstElementLL();
		System.out.println("Here's the first element in LinkedList: ");
		System.out.println(firstElem.removeReturnfirstElement(flowerList));
		
		firstElem.displayLL(flowerList);

	}

}
