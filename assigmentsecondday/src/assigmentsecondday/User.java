package assigmentsecondday;

public class User {
	
	public User() {
		
	}
	
	public User(int id, String name, String lastName, double userNumber) {
		this();
		this.id= id;
		this.name = name;
		this.lastName = lastName;
		this.userNumber = userNumber;
	}
	

	int id;
	String name;
	String lastName;
	double userNumber;
}
