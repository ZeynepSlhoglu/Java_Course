package assignmentofthirdday;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " Adlı Kullanıcı Sisteme Kaydedildi");
	}
	
	public void deleteUser(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " adlı eğitmenin " + instructor.getContent()  +" içeriği silindi.");	
	}

	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	
	public void deleteUser(Instructor[] instructors) {
		for(Instructor instructor : instructors) {
			deleteUser(instructor);
		}
	}
	
	
}
