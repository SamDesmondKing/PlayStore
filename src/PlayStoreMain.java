import java.io.*;

public class PlayStoreMain {
	
	public static void main(String[] args) {

		PlayStore store = new PlayStore();
		String menuString;
		int menuInput = 0;
		boolean quit = false;

		// Adding new publications
		String[] authors1 = { "L. Tolstoy" };
		Book b1 = new Book("b1", "War and Peace", 12.55, "The Russian Messenger", 1225, authors1);
		String[] authors2 = { "F. Scott Fitzgerald" };
		Book b2 = new Book("b2", "The great gatsby", 10, "Charles Scribner's Sons", 180, authors2);
		String[] authors3 = { "Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein" };
		Book b3 = new Book("b3", "Introduction to algorithms", 100, "MIT Press", 1312, authors3);
		Magazine m1 = new Magazine("m1", "Forbes Magazine", 8.99, "Forbes Media", 50, 201904);

		// Adding new applications
		Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4");
		Application g2 = new Application("g2", "Pokemon", 5, "iOSV10");

		// a free app
		Application app1 = new Application("app1", "Calendar", "androidV3");

		// Adding these content objects to the store
		store.addContent(b1);
		store.addContent(b2);
		store.addContent(b3);
		store.addContent(m1);
		store.addContent(g1);
		store.addContent(g2);
		store.addContent(app1);
		store.addContent(b1);
		store.addContent(b2);
		store.addContent(b3);
		store.addContent(m1);
		store.addContent(g1);
		store.addContent(g2);
		store.addContent(app1);

		// Adding new users and comments
		User u1 = new User("u1", "John Doe", "0412000", 200);
		User u2 = new User("u2", "Mary Poppins", "0433191");
		User u3 = new User("u3", "Dave Smith", "0413456", 1000);
		User u4 = new User("u4", "Jackie Chan", "0417654");
		User u5 = new User("u5", "Sam", "1234556", 0);
		Comment comment1 = new Comment(u1, "This is a fantastic game!");
		g1.addReview(comment1);
		Comment comment2 = new Comment(u2, "I never liked this game!");
		g1.addReview(comment2);
		g1.addReview(new Comment(u3, "The game crashes frequently"));
		b1.addReview(new Comment(u2, "I love Tolstoy!"));

		// Adding these users to the store
		store.addUser(u1);
		store.addUser(u2);
		store.addUser(u3);
		store.addUser(u4);
		store.addUser(u5);

		// -- Main Menu --
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		do {
			try {
				
				//Menu message
				System.out.println(
						"PlayStore Admin Menu\nWhat would you like to do?\n1. Upgrade a user to premium\n2. Purchase an item for a user\n3. List all available content in store\n4. Show purchased content for a user\n5. View comments on content\n6. Quit");

				menuString = stdin.readLine();
				menuInput = Integer.parseInt(menuString);
				
				//Checking selection in range (other exceptions handled by try/catch)
				if (menuInput > 6 || menuInput <= 0) {
					System.err
							.println("Invalid input, please enter a number between 1 and 6.\nReturning to main menu.");

				//Option 1 - Upgrade a user to premium.
				} else if (menuInput == 1) {
					
					System.out.println("Option 1 selected - upgrade a user to premium\nPlease enter userID");
					String userID = stdin.readLine().trim();
					User thisUser = store.getUserByID(userID);
					thisUser.becomePremium();

				//Option 2 - Purchase one item for one user
				} else if (menuInput == 2) {
					
					System.out.println("Option 2 selected - purchase an item for a user.\nPlease enter userID");
					String userID = stdin.readLine().trim();
					User thisUser = store.getUserByID(userID);
					
					System.out.println("User " + thisUser.getName() + " selected.\nBalance: $" + thisUser.getBalance() + "\nPlease enter contentID");
					String contentID = stdin.readLine().trim();
					Content thisContent = store.getContentByID(contentID);
					
					thisUser.buyContent(thisContent);
					System.out.println("User " + thisUser.getName() + " has bought " + thisContent.getClass().getName() + ": " + thisContent.getName() +".\nRemaining balance: $" + thisUser.getBalance());
				
				//Option 3 - List all contents in the store
				} else if (menuInput == 3) {
					
					System.out.println("Option 3 selected - PlayStore contents:");
					store.showContent();
					System.out.println("");
				
				//Option 4 - Show all purchased items of a user
				} else if (menuInput == 4) {
					
					System.out.println("Option 4 selected - show all purchased items of a user.\nPlease enter userID");
					String userID = stdin.readLine().trim();
					User thisUser = store.getUserByID(userID);
					
					System.out.println("User " + thisUser.getName() + " has bought:");
					thisUser.showContentBought();
					System.out.println("");

				//Option 5 - Show all comments on a piece of content
				} else if (menuInput == 5) {
					
					System.out.println("Option 5 selected.\nPlease enter contentID");
					String contentID = stdin.readLine().trim();
					Content thisContent = store.getContentByID(contentID);
					
					System.out.println("Comments for " + thisContent.getName() + ":");
					thisContent.showReviews();
					System.out.println("");

				//Option 6 - Quit
				} else if (menuInput == 6) {
					quit = true;
				}

			} catch (NumberFormatException nfe) {
				System.err.println("Invalid input, please enter a number between 1 and 5.\nReturning to main menu.");

			} catch (PurchaseException purchaseException) {
				System.err.println("Error - not enough funds in account.\n Account balance is $" + purchaseException.getMaxAvailable() + "\nReturning to main menu.");
				
			} catch (Exception e) {
				System.err.println("Error - returning to main menu");
			}

		} while (!quit);
	}
}
