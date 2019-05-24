import java.util.ArrayList;
import java.lang.Object;

public class PlayStore {
	
	private ArrayList<Content> contents = new ArrayList<Content>();
	private ArrayList<User> users = new ArrayList<User>();
	
	
	//Adds the content into the playstore's content array list
	public void addContent(Content content) {
		this.contents.add(content);
	}
	
	
	//Adds user to the playstore's users array list
	public void addUser(User user) {
		this.users.add(user);
	}	
	
	
	//Searches PlayStore's ArrayList of Users for a User by their ID (String)
	public User getUserByID(String ID) {
		User searchResult = null;
		
		for (int i = 0; i < this.users.size(); i++) {
			if (this.users.get(i).getID().equalsIgnoreCase(ID)) {
				searchResult = this.users.get(i);
			}
		}
		return searchResult;
	}
	
	
	//Searches PlayStore's ArrayList of Content for a Content object by its contentID (String)
	public Content getContentByID(String ID) {
		Content searchResult = null;
		
		for (int i = 0; i < this.contents.size(); i++) {
			if (this.contents.get(i).getID().equalsIgnoreCase(ID)) {
				searchResult = this.contents.get(i);
			}
		}
		return searchResult;
	}
	
	
	//Displays all contents of contents array list
	public void showContent() {
		for (Content content : this.contents) {
			System.out.println(content.getName());
		}
	}
	
	
	//Takes name of class (String) as parameter and shows contents of that specific class type
	public void showClassContent(String contentClass) {
		
		for (int i = 0; i < contents.size(); i++) {
			if (contents.get(i).getClass().getName() == contentClass) {
				System.out.println(contents.get(i).getName());
			}
		}
	}
}
