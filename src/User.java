
public class User {

	private String ID;
	private String name;
	private String phoneNumber;
	private double account;
	
	
	public User(String ID, String name, String phoneNumber, double account) {
		
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = account;
		
	}
	
	public User(String ID, String name, String phoneNumber) {
		
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = 500;
		
	}
	
	
}
