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
