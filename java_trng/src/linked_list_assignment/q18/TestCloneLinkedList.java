package linked_list_assignment.q18;

import java.util.LinkedList;
import java.util.List;

public class TestCloneLinkedList {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		List<String> clonedFlowerList = new LinkedList<String>();
		
		CloneLinkedList cloner = new CloneLinkedList();
		cloner.joinLL(flowerList, clonedFlowerList);
		cloner.displayLL(clonedFlowerList);

	}

}
