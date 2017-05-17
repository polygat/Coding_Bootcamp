package exercise033;

public class Book {
	private String title;
	private Author author;
	private final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getPhysicalCopies() {
		return physicalCopies;
	}

	public void setPhysicalCopies(int physicalCopies) {
		this.physicalCopies = physicalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int getTimesRented() {
		return timesRented;
	}

	public void setTimesRented(int timesRented) {
		this.timesRented = timesRented;
	}

	public String getIsbn() {
		return isbn;
	}
	
	Book(String title, Author author, final String isbn, int physicalCopies, int availableCopies, int timesRented) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.physicalCopies = physicalCopies;
		this.availableCopies = availableCopies;
		this.timesRented = timesRented;
	}
	
	@Override
	public String toString() {
		return "Title = " + title + ", Author = " + author + ", isbn = " + isbn
				+ ", PhysicalCopies = " + physicalCopies + ", AvailableCopies = "
				+ availableCopies + ", TimesRented = " + timesRented;
	}

	public void rentPhysicalCopy() {
        if(this.physicalCopies>=1){
            System.out.println("Great! There is an available copy for renting.");
        }
        setAvailableCopies(getAvailableCopies()-1);
	}
	
	public boolean isAvailable(){
        if(this.availableCopies>=1){
            return true;
        }else{
            return false;            
        }
    }
	
	boolean hasAuthor(String name) {
		if (name.equals(author)) {
			return true;
		} else{
			return false;
		}
	}
}