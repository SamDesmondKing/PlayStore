
public class Book extends Publication {

	private String[] authors;
	
	//Constructor
	public Book(String ID, String name, double price, String publisher, int numPages, String[] authors) {
		super(ID, name, price, publisher, numPages);
		this.authors = authors;
	}
	
	
	//Gets author array
	public String[] getAuthors() {
		return this.authors;	
	}
}
