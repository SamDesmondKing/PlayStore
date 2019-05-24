
public class Comment {

	private User user;
	private String comment;
	
	//Constructor
	public Comment(User user, String comment) {
		this.user = user;
		this.comment = comment;
	}
	
	
	//Gets comment
	public String getComment() {
		return this.comment;
	}
}
