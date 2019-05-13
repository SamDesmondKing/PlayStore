import java.util.ArrayList;

public abstract class Content {

	private String ID;
	private String name;
	private int numDownloads;
	private double price;
	private ArrayList<Comment> reviews = new ArrayList<Comment>();
	
	public Content(String ID, String name, double price) {
		
		this.ID = ID;
		this.name = name;
		this.price = price;
		
	}
	
	public String getID() {
		return this.ID;
	}
	
}
