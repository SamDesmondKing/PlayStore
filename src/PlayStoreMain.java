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

		// -- Main Menu --

		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		do {

			try {

				System.out.println("PlayStore Admin Menu\nWhat would you like to do?\n1. Upgrade to premium\n2. Purchase an item\n3. List all available content\n4. Show purchased content\n5. View comments on content\n6. Quit");
				
				menuString = stdin.readLine();
				menuInput = Integer.parseInt(menuString);
				
				if (menuInput > 6 || menuInput <= 0) {
					System.err.println("Invalid input, please enter a number between 1 and 5.\nReturning to main menu.");
					
				} else if (menuInput == 1) {
					
					System.out.println("Option 1");
					
				} else if (menuInput == 2) {
					
					System.out.println("Option 2");
					
				} else if (menuInput == 3) {
				
					System.out.println("Option 3");
					
				} else if (menuInput == 4) {
					
					System.out.println("Option 4");
					
				} else if (menuInput == 5) {
					
					System.out.println("Option 5");
					
				} else if (menuInput == 6) {
					
					quit = true;
				}

			} catch (NumberFormatException nfe) {

				System.err.println(
						"Invalid input, please enter a number between 1 and 5.\nReturning to main menu.");
				
			} catch (Exception ioe) {

				System.err.println("Problem in input, returning to main menu.");
				System.err.println(ioe);
				
			} 

		} while (!quit);	
	}
}
