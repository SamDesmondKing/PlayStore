import java.util.ArrayList;

public abstract class Content {

	private String ID;
	private String name;
	private int numDownloads;
	private double price;
	private ArrayList<Comment> reviews = new ArrayList<Comment>();
	
	public Content() {
		
		
	}
	
}
