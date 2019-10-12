package day11.Assignments.q1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import day11.Assignments.q1.bean.Book;

public class BookOperations {
	
	public void iterateThroughSet(Set<Book> bookList)
	{
		Iterator iter = bookList.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next().toString());
		}
	}

}
