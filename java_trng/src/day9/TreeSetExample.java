package day9;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> personSet = new TreeSet<String>();
		personSet.add("Gourab");
		personSet.add("Sudhanya");
		personSet.add("Dipankar");
		personSet.add("Prince");
		
		Iterator<String> iter = personSet.iterator();
		while (iter.hasNext())
		{
			String name = iter.next();
			System.out.println(name);
		}

	}

}
