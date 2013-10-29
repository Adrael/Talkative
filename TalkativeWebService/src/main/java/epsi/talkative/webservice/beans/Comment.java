package epsi.talkative.webservice.beans;

public class Comment {
	private int id;
	private String content;
	private Commentator commentator;
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Commentator getCommentator() {
		return commentator;
	}

	public void setCommentator(Commentator commentator) {
		this.commentator = commentator;
	}
}
