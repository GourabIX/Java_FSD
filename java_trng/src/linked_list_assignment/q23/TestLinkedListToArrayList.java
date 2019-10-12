package linked_list_assignment.q23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedListToArrayList {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		LinkedListToArrayList converterToAL = new LinkedListToArrayList();
		List<String> convertedAL = new ArrayList<String>();
		convertedAL = converterToAL.convertLLToAL(flowerList);
		System.out.println("Here's the contents of the ArrayList converted from flowerList: ");
		System.out.println(convertedAL);

	}

}
