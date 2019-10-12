package day9;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(101, "Gourab");
		map1.put(102, "Sudhanya");
		map1.put(103, "Dipankar");
		map1.put(104, "Prince");
		
		// System.out.println(map1.get(101));
		
		Set<Integer> setOfKeys = map1.keySet();
		for (int key: setOfKeys)
		{
			System.out.println(key + ": " + map1.get(key));
		}
		
		for (int key = 105; key < 1000; key++)
		{
			System.out.println(key + ": " + map1.get(key));
		}

	}

}
