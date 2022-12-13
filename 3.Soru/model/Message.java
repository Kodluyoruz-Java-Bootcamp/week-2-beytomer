package emlakcepte.model;

public class Message {
	
	private String title;
	private String content;
	private User from;
	private User to;
	
	private static Message message;

	private Message() {
	}

	private Message(String title, String content, User from, User to) {
		super();
		this.title = title;
		this.content = content;
		this.from = from;
		this.to = to;
	}

	public static Message getInstance(){
		if(message==null){
			message=new Message();
		}
		return message;
	}
	public static Message getInstance(String title, String content, User from, User to){
		if(message==null){
			message=new Message(title,content,from,to);
		}
		return message;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getFrom() {
		return from;
	}
	public void setFrom(User from) {
		this.from = from;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}
	
	
	

}
