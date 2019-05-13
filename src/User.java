import java.util.ArrayList;

public class User {

	private String ID;
	private String name;
	private String phoneNumber;
	private double account;
	private boolean premium;
	ArrayList<Content> contentBought = new ArrayList<Content>();
	
	//Do we need to be able to search a user's comment history?
	
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
	
	public void becomePremium() {
		
		if (this.account >= 100) {
			
			this.account -= 100;
			this.premium = true;
			System.out.println("Premium transaction successfull");
			
		} else {
			System.out.println("Error - not enough funds in account. Please top up account manually.");
		}
	}
	
	public void buyContent(Content purchase) {
		
		if (this.premium == true) {
			//Wait for exceptions week to see exactly how they want to handle this.
			//Deduct account (premium)
			//Add content to user's content array
			//Increment the content's download count
			
		} else {
			//See above.
			//Deduct account (standard)
			//Add content to user's content array
			//Increment the content's download count
		}
	}
	
	public void showContentBought() {
		
		for (int i = 0; i < contentBought.size(); i++) {
			
			System.out.println(contentBought.get(i).getName());
		}
	}
	
	
	
}
