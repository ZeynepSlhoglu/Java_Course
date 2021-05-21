package assignmentofthirdday;

public class Instructor extends User{
	private String content;
	private double view;
	
	public Instructor(int id,String firstName,String lastName, String content, double view) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setContent(content);
		setView(view);
	}
	
	public Instructor(String content, double view) {
		super();
		this.content = content;
		this.view = view;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getView() {
		return view;
	}
	public void setView(double view) {
		this.view = view;
	}
}
