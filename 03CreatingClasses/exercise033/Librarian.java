package exercise033;

public class Librarian {
	private Library library;
	
	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	Librarian(Library library) {
		this.setLibrary(library);
	}
	
	public static void findMeBooksFromAuthor(String name) {
		//Receives an author name and delegates the request to the library's printBooksFromAuthor method
		Library.printBookFromAuthor(name);
	}
	
	public static void findMeAvailableBooks() {
		//Delegates the request to the library's printAvailableBooks method
		Library.printAvailableBooks();
	}
	
	public static void findMeBook(String title) {
		//Receives a book's title and delegates the request to the library's printBookDetails method
		Library.printBookDetails(title);
	}

	public static void findMostPopularBook() {
	//Delegates the request to the library's printTheMostPopularBook method
		Library.printTheMostPopularBook();
	}
	
}