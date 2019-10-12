package linked_list_assignment.q26;

import java.util.LinkedList;
import java.util.List;

public class TestReplaceElement {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		ReplaceElement replacer = new ReplaceElement();
		replacer.replaceElement(flowerList, 2, "Daffodil");
		replacer.listPrint(flowerList);

	}

}
