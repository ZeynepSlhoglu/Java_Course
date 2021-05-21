package assignmentofthirdday;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"Engin","Demiroğ", "Java", 10000);
		
		Student student = new Student(2, "Zeynep", "Salihoğlu", 493);
		
		UserManager userManager = new UserManager();

		User[] users = {instructor,student};

		userManager.addMultiple(users);
		
		Instructor[] instructors = {instructor};
		
		userManager.deleteUser(instructors);
		
		
	}

}
