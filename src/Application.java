
public class Application extends Content {

	private String OSType;
	
	public Application(String ID, String name, double price, String OSType) {
		super(ID, name, price);
		this.OSType = OSType;
	}
	
	
	public Application(String ID, String name, String OSType) {
		super(ID, name);
		this.OSType = OSType;
	}
	
	

}
