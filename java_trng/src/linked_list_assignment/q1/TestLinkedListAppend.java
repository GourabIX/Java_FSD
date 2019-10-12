package linked_list_assignment.q1;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedListAppend {

	public static void main(String[] args) {
		
		List<String> colorList = new LinkedList<String>();

		LinkedListAppend displayAppend = new LinkedListAppend();
		displayAppend.appendToLL(colorList);
		displayAppend.displayLL(colorList);

	}

}
