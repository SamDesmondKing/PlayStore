
public class Application extends Content {

	private String OSType;
	
	//Constructor one
	public Application(String ID, String name, double price, String OSType) {
		super(ID, name, price);
		this.OSType = OSType;
	}
	
	
	//Constructor two
	public Application(String ID, String name, String OSType) {
		super(ID, name);
		this.OSType = OSType;
	}
}
