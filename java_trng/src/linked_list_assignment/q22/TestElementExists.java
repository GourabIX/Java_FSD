package linked_list_assignment.q22;

import java.util.LinkedList;
import java.util.List;

public class TestElementExists {

	public static void main(String[] args) {
		
		List<String> flowerList = new LinkedList<String>();
		flowerList.add("Rose");
		flowerList.add("Sunflower");
		flowerList.add("Dahlia");
		flowerList.add("Marygold");
		flowerList.add("Tulip");
		
		ElementExists elementCheck = new ElementExists();
		System.out.println("Does \"Dahlia\" exist in flowerList? " + elementCheck.checkElementExistence(flowerList, "dahlia"));

	}

}
