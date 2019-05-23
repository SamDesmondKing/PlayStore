public class PlayStoreMain {

	public static void main(String[] args) {

		PlayStore store = new PlayStore();
		
		
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

		try {
			u1.buyContent(b1);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			u1.buyContent(b3);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			u1.buyContent(m1);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		store.showContent();

		g1.showComments();
	
		store.addContent(b1); 
		store.addContent(b2); 
		store.addContent(b3);
		store.addContent(m1);
		store.addContent(g1); 
		store.addContent(g2); 
		store.addContent(app1);
		 
		store.addUser(u1); 
		store.addUser(u2); 
		store.addUser(u3); 
		store.addUser(u4);
		 
		
		/* Simulating transactions, showing content, comments etc etc. They can be
		driven by menu input as well. */
		
		//These need try-catch blocks
		
		
		//u1.buyContent(b1); 
		//u1.buyContent(b3);
		//u1.buyContent(m1);
		
		//u4.buyContent(g1); 
		u4.becomePremium(); 
		//u4.buyContent(m1);
		
		u2.becomePremium(); 
		//u2.buyContent(b1); 
		//u2.buyContent(g1);
		
		
		//Call a method to show all content items of a particular type, e.g.
		
		store.showClassContent("Book");
		store.showClassContent("Magazine");
		
	}
}
