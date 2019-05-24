
public class Comment {

	private User user;
	private String comment;
	
	public Comment(User user, String comment) {
		this.user = user;
		this.comment = comment;
	}
	
	
	public String getComment() {
		return this.comment;
	}
	
}
