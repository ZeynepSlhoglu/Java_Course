package assigmentsecondday;


public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Engin","Demiro�",06);
		
		User user2 = new User(2,"Zeynep","Saliho�lu",34);
		

		UserManager userManager = new UserManager();
		
		userManager.addToUser(user1);
		
		userManager.addToUser(user2);
		
		

	}

}
