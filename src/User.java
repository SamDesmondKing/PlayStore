import java.util.ArrayList;

public class User {

	private String ID;
	private String name;
	private String phoneNumber;
	private double account;
	private boolean premium;
	ArrayList<Content> contentBought = new ArrayList<Content>();

	// Do we need to be able to search a user's comment history?

	//Constructor 1
	public User(String ID, String name, String phoneNumber, double account) {
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = account;

	}

	//Constructor 2
	public User(String ID, String name, String phoneNumber) {
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = 500;

	}

	//Setting user to premium status
	public void becomePremium() {
		if (this.account >= 100) {
			this.account -= 100;
			this.premium = true;
			System.out.println("Premium transaction successfull");

		} else {
			System.out.println("Error - not enough funds in account. Please top up account manually.");
		}
	}

	//Purchasing content
	public void buyContent(Content purchase) throws PurchaseException {

		//If user is premium
		if (this.premium == true) {
			if (this.account < (purchase.getPrice() * 0.8)) {
				//Throwing exception if account too low
				throw new PurchaseException("Insufficient funds", this.account);
			} else {
				//Otherwise, deducting 80% of the content price from user account
				this.account -= (purchase.getPrice() * 0.8);
			}

		//If user is not premium
		} else {
			if (this.account < purchase.getPrice()) {
				//Throwing exception if account is too low
				throw new PurchaseException("Insufficient funds", this.account);
			} else {
				//Otherwise, deducting full price from user account
				this.account -= purchase.getPrice();
			}
		}

		// Add content to user's content array
		this.contentBought.add(purchase);
		
		//Increment the download count of the content in question 
		purchase.addDownload();
	}

	//Iterates through the content array of this user and print the names of the content
	public void showContentBought() {
		for (int i = 0; i < contentBought.size(); i++) {
			System.out.println(contentBought.get(i).getName());
		}
	}

}
