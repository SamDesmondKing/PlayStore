
public class Magazine extends Publication {

	private int volume;
	
	public Magazine(String ID, String name, double price, String publisher, int numPages, int volume) {
		super(ID, name, price, publisher, numPages);
		this.volume = volume;
	}
}
