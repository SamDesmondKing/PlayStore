
public class Publication extends Content {

	private String publisher;
	private int numPages;
	
	//Constructor
	public Publication(String ID, String name, double price, String publisher, int numPages)  {
		super(ID, name, price);
		this.publisher = publisher;
		this.numPages = numPages;
	}

	
	//Gets numPages
	public int getNumPages() {
		return this.numPages;
	}
	
	
	//Gets publisher
	public String getPublisher() {
		return this.publisher;
	}

}
