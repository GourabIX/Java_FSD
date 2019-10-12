package day9;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(101, "Gourab");
		map1.put(102, "Sudhanya");
		map1.put(103, "Dipankar");
		map1.put(104, "Prince");
		
		System.out.println("\nAfter invoking put() method: ");
		for(Map.Entry m: map1.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		map1.putIfAbsent(105, "Arib and Stephen's child");
		System.out.println("\nAfter invoking putIfAbsent() method: ");
		for (Map.Entry m: map1.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(107, "Akansh Sai");
		map2.putAll(map1);
		System.out.println("\nAfter invoking putAll() method: ");
		for (Map.Entry m2: map2.entrySet())
		{
			System.out.println(m2.getKey() + " " + m2.getValue());
		}
		
	}

}
