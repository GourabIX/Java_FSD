package day11.Assignments.q1;

import java.util.HashSet;
import java.util.Set;

import day11.Assignments.q1.bean.Book;

public class TestBookOperations {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		try
		{
			book1.setBookId(101);
			book1.setBookName("Deception Point");
			book1.setBookPrice(56.25);
			if (book1.getBookPrice() < 5.00)
			{
				throw new PriceTooLowException();
			}
			book1.setBookAuthor("Dan Brown");
		
			book2.setBookId(102);
			book2.setBookName("Harry Potter and the Order of the Phoenix");
			book2.setBookPrice(60.00);
			if (book2.getBookPrice() < 5.00)
			{
				throw new PriceTooLowException();
			}
			book2.setBookAuthor("J.K. Rowling");

			book3.setBookId(103);
			book3.setBookName("The Invisible Man");
			book3.setBookPrice(4.00);
			if (book3.getBookPrice() < 5.00)
			{
				throw new PriceTooLowException();
			}
			book3.setBookAuthor("H.G. Wells");
			
			book4.setBookId(104);
			book4.setBookName("The Perks of Being a Wallflower");
			book4.setBookPrice(45.50);
			if (book4.getBookPrice() < 5.00)
			{
				throw new PriceTooLowException();
			}
			book4.setBookAuthor("Stephen Chbosky");
			
		}
		
		catch (Exception exc)
		{
			System.out.println("Exception detected: " + exc);
		}
		
		Set<Book> bookList = new HashSet<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		
		BookOperations operations = new BookOperations();
		operations.iterateThroughSet(bookList);
	}

}
