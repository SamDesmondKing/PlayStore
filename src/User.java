import java.util.ArrayList;

public class User {

	private String ID;
	private String name;
	private String phoneNumber;
	private double account;
	private boolean premium;
	ArrayList<Content> contentBought = new ArrayList<Content>();

	// Constructor 1
	public User(String ID, String name, String phoneNumber, double account) {
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = account;
	}

	// Constructor 2
	public User(String ID, String name, String phoneNumber) {
		this.ID = ID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = 500;
	}

	// Gets ID
	public String getID() {
		return this.ID;
	}

	// Gets name
	public String getName() {
		return this.name;
	}
	
	
	//Gets balance
	public double getBalance() {
		return this.account;
	}

	// Setting user to premium status
	public void becomePremium() {
		if (this.account >= 100 && this.premium == false) {
			this.account -= 100;
			this.premium = true;
			System.out.println("Premium transaction successfull");

		} else if (this.premium == true) {
			System.out.println("They are already a premium user!");

		} else {
			System.err.println(
					"Error - not enough funds in account.\nPremium charge is $100\nBalance: $" + this.getBalance() + "\nPlease top up account manually.\nReturning to main menu.");
		}
	}

	// Purchasing content
	public void buyContent(Content purchase) throws PurchaseException {

		// If user is premium
		if (this.premium == true) {
			if (this.account < (purchase.getPrice() * 0.8)) {
				// Throwing exception if account too low
				throw new PurchaseException("Insufficient funds", this.account);
			} else {
				// Otherwise, deducting 80% of the content price from user account
				this.account -= (purchase.getPrice() * 0.8);
				System.out.println("Purchase successfull.");
			}

		// If user is not premium
		} else {
			if (this.account < purchase.getPrice()) {
				// Throwing exception if account is too low
				throw new PurchaseException("Insufficient funds", this.account);
			} else {
				// Otherwise, deducting full price from user account
				this.account -= purchase.getPrice();
				System.out.println("Purchase successfull.");
			}
		}

		// Add content to user's content array
		this.contentBought.add(purchase);

		// Increment the download count of the content in question
		purchase.addDownload();
	}

	// Iterates through the content array of this user and print the names of the
	// content
	public void showContentBought() {

		if (this.contentBought.size() == 0) {
			System.out.println("Nothing so far!");
			
		} else {
			for (int i = 0; i < this.contentBought.size(); i++) {
				System.out.println(this.contentBought.get(i).getName());
			}
		}
	}
}
