package linked_list_assignment.q25;

import java.util.LinkedList;
import java.util.List;

public class TestCheckLinkedListEmptyness {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		List<String> emptyList = new LinkedList<String>();
		
		CheckLinkedListEmptyness checker = new CheckLinkedListEmptyness();
		System.out.println("Is flowerList empty? " + checker.emptynessChecker(flowerList));
		System.out.println("Is emptyList empty? " + checker.emptynessChecker(emptyList));

	}

}
