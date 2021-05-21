package assignmentofthirdday;

public class Student extends User{
	private int studentNumber;
	
	
	public Student(int id,String firstName,String lastName,int studentNumber) {
	setId(id);
	setFirstName(firstName);
	setLastName(lastName);
	setStudentNumber(studentNumber);
}

	public Student(int studentNumber) {
		super();
		this.studentNumber = studentNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
}
