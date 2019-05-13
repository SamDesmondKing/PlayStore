
public class Publication extends Content {

	private String publisher;
	private int numPages;
	
	public Publication(String ID, String name, double price, String publisher, int numPages)  {
		
		super(ID, name, price);
		
		this.publisher = publisher;
		this.numPages = numPages;
		
	}
	

	public int getNumPages() {
		return this.numPages;
	}
	
	public String getPublisher() {
		return this.publisher;
	}

}
