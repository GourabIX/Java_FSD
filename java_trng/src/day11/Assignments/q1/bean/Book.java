package day11.Assignments.q1.bean;

public class Book {
	
	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
	
	public Book()
	{
		// Do nothing here.
	}
	
	public Book(int bookId, String bookName, double bookPrice, String bookAuthor)
	{
		bookId = this.bookId;
		bookName = this.bookName;
		bookPrice = this.bookPrice;
		bookAuthor = this.bookAuthor;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor="
				+ bookAuthor + "]";
	}
	
}
