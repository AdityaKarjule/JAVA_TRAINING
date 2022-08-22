import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class SortByBookPrice implements Comparator<Book2> {

	
	
	public int compare(Book2 a,Book2 b)
	{
		if(a.bookPrice < b.bookPrice) return 1;
		return -1;
//		return Integer.compare(a.bookPrice, b.bookPrice);
	}
}
class SortByBookTitle implements Comparator<Book2> {

	// Method
	// Sorting in ascending order of name
	public int compare(Book2 a, Book2 b)
	{

		return a.title.compareTo(b.title);
	}
}

public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Book2> bookShelf = new ArrayList<Book2>();
		
		Book2 book1 = new Book2(1,"Teh adventures of Tin Tin","George W","2nd",264,250);
		Book2 book2 = new Book2(2,"The Hobbit","Flamingo","4nd",564,385);
		Book2 book3 = new Book2(3,"A tribute to Abdul:","M.K Bose","1st",324,200);
		Book2 book4 = new Book2(4,"Friends","Chandler Bing","3rd",479,340);
		
		System.out.println("Unsorted");

	
		System.out.println("Adding the 1st book.");
		bookShelf.add(book1);
		System.out.println("1st book is : "+book1);
	
		System.out.println("Adding the 2nd book..");
		bookShelf.add(book2);
		System.out.println("2nd book is : "+book2);
		
		System.out.println("Adding the 3rd book...");
		bookShelf.add(book3);
		System.out.println("3rd book is : "+book3);
		
		System.out.println("Adding the 4th book....");
		bookShelf.add(book4);
		System.out.println("4th book is : "+book4);
		
		Collections.sort(bookShelf, new SortByBookPrice());
		System.out.println("\nSorted by Book price.");
		for(Book2 b: bookShelf) {
			System.out.println(b);
		}
		Collections.sort(bookShelf, new SortByBookTitle());
		System.out.println("\nSorted by Book Title.");
		for(Book2 b: bookShelf) {
			System.out.println(b);
		}
	
	/*	System.out.println("\nSorted by Book Price.");
	
		for (int i = 0; i < bookShelf.size(); i++)
			System.out.println(bookShelf.get(i));*/
	}
}
class Book2
{
	int bookNumber;
	String title;
	String bookAuthor;
	String edition;
	int numberOfPages;
	int bookPrice;
	

	
	public Book2(int bookNumber, String title, String bookAuthor, String edition, int numberOfPages, int bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.title = title;
		this.bookAuthor = bookAuthor;
		this.edition = edition;
		this.numberOfPages = numberOfPages;
		this.bookPrice = bookPrice;
	}

	

	@Override
	public String toString() {
		return "Book2 [bookNumber=" + bookNumber + ", title=" + title + ", bookAuthor=" + bookAuthor + ", edition="
				+ edition + ", numberOfPages=" + numberOfPages + ", bookPrice=" + bookPrice + "]";
	}






}
