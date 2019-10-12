package java_assignment_09112019.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayListGamesIterator_q2 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		
		System.out.println("Enter names of 3 games: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 2; i++)
		{
			gameList.add(sc.nextLine());
		}
		sc.close();
		
		ArrayListGamesIterator_q2 testIterator = new ArrayListGamesIterator_q2();
		testIterator.displayList(gameList);

	}

}
