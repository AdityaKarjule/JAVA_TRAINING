import java.util.HashSet;
import java.util.Objects;

public class Library {
public static void main(String[] args) {
	Book b1 = new Book(1,"Maria","The Lord Of The Rings"," edition3 ",230,230.66f);
	Book b2 = new Book(2,"Andrew","The Code"," edition 2",260,2350.66f);
	Book b3 = new Book(3,"J.K Rowling","Harry potteer"," edition 3",390,240.66f);
	Book b4 = new Book(3,"J.K Rowling","Harry potteer"," edition 3",390,240.66f);
	
	
	System.out.println("Book 1 "+b1);
	System.out.println("Book 2 "+b2);
	System.out.println("Book 3 "+b3);
	System.out.println("Book 4 "+b3);
	
	
	System.out.println("Book 1 "+b1.hashCode());
	System.out.println("Book 2 "+b2.hashCode());
	System.out.println("Book 3 "+b3.hashCode());
	System.out.println("Book 3 "+b3.hashCode());
	
	
	
	HashSet<Book> bookshelf = new HashSet<Book>(); 
	
	System.out.println("Adding Book 1");
	bookshelf.add(b1);
	
	System.out.println("Adding Book 2");
	bookshelf.add(b2);
	
	System.out.println("Adding Book 3");
	bookshelf.add(b3);
	
	System.out.println("Adding Book 4");
	bookshelf.add(b4);
	
	for (Book book : bookshelf) {
		System.out.println("The Book : "+book);
	}
}
}

class Book{
	int bookNumber;
	String authorName;
	String title;
	String edition;
	int noOfPages;
	float bookPrice;
	


	public Book(int bookNumber, String authorName, String title, String edition, int noOfPages, float bookPrice) {
		super();
		this.bookNumber = bookNumber;
		this.authorName = authorName;
		this.title = title;
		this.edition = edition;
		this.noOfPages = noOfPages;
		this.bookPrice = bookPrice;
	}



	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", authorName=" + authorName + ", title=" + title + ", edition="
				+ edition + ", noOfPages=" + noOfPages + ", bookPrice=" + bookPrice + "]";
	
	
	}



	@Override
	public int hashCode() {
		return Objects.hash(authorName, bookNumber, bookPrice, edition, noOfPages, title);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && bookNumber == other.bookNumber
				&& Float.floatToIntBits(bookPrice) == Float.floatToIntBits(other.bookPrice)
				&& Objects.equals(edition, other.edition) && noOfPages == other.noOfPages
				&& Objects.equals(title, other.title);
	}


}







