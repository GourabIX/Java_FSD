package linked_list_assignment.q24;

import java.util.LinkedList;
import java.util.List;

public class TestCompareLinkedLists {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		List<String> flowerListClone = new LinkedList<String>();
		flowerListClone.add("Rose");
		flowerListClone.add("Sunflower");
		flowerListClone.add("Dahlia");
		flowerListClone.add("Marygold");
		flowerListClone.add("Tulip");
		
		CompareLinkedLists compareChecker = new CompareLinkedLists();
		System.out.println("Are the two lists equal? " + compareChecker.compareLists(flowerList, flowerListClone));

	}

}
