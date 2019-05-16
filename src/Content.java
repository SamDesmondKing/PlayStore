import java.util.ArrayList;

public abstract class Content {

	private String ID;
	private String name;
	private int downloads;
	private double price;
	private ArrayList<Comment> reviews = new ArrayList<Comment>();
	
	public Content(String ID, String name, double price) {
		this.ID = ID;
		this.name = name;
		this.price = price;
	}
	
	public Content (String ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDownloads() {
		return this.downloads;
	}
	
	//Adds comment (review) to this content's comment array list
	public void addReview(Comment comment) {
		this.reviews.add(comment);
	}
	
	//Iterates through the comment array list of this content object and prints the comments
	public void showComments() {
		for (int i = 0; i < this.reviews.size(); i++) {
			System.out.println(this.reviews.get(i).getComment());
		}
	}
	
	public void addDownload() {
		this.downloads++;
	}
	
}
