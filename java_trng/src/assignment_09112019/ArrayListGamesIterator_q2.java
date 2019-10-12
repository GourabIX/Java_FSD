// 2. Write a Java program to iterate through all elements in an array list. 

package assignment_09112019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListGamesIterator_q2 {

	public static void main(String[] args) {
		
		List<String> gameList = new ArrayList<String>(5);
		
		System.out.println("Enter names of 3 games: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 2; i++)
		{
			gameList.add(sc.nextLine());
		}
		sc.close();
		
		System.out.println("Here are the games in the ArrayList: ");
		for(String game: gameList)
		{
			System.out.println(game);
		}

	}

}
