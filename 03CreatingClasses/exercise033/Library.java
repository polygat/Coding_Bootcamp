package exercise033;

public class Library {
	private static Book[] books;
	
	public static Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		Library.books = books;
	}

	Library (Book[] books){
		Library.books = books;
	}
	
	public static void printAvailableBooks() {
		//Prints books that have at least one available physical copy. 
		for(int i=0; i<books.length; i++){
	        if(books[i].isAvailable()){
	            System.out.println(books[i].toString());                
	        }    
	    }
	}
	
	public static void printBookDetails(String title) {
		//(Searches for a book based on a given title.
		//If the book exists then its details should be printed, otherwise an error message should be displayed)
		int num = 0;
		for(int i=0; i<books.length; i++){
			//books[i].getTitle().toString();
			if(Library.books[i].getTitle().equals(title)){
                System.out.println(books[i].toString());
                num +=1;
            } 
		}
		if (num==0) {
			System.out.println(title + " does not exist");
		}
	}
	
	public static void printBookFromAuthor(String author){
		int num = 0;
        for(int i=0; i<books.length; i++){
        	books[i].getTitle().toString();
            if(books[i].getAuthor().getName().equals(author)){
                System.out.println(books[i]);
                num +=1;
            }
        }
        if (num==0) {
        	System.out.println(author + " not found");
        }
        
    }
	
	public static void printTheMostPopularBook(){
		int countRents = 0;
		int x = 0;
		for(int i=0; i<books.length; i++){
			if(books[i].getTimesRented()>countRents){
				countRents = books[i].getTimesRented();
				x = i;
			}
		}
	        System.out.println(books[x]);
	}
}