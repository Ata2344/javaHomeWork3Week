package kodlama;

public class UserManager {

	public void addUser(User user) {
		
		if (user.isInstructor() == false) {
			System.out.println("Adý:" + user.getFullName()+"\ne-Mail : "+ user.geteMail() + "\nKullanýcý : Tipi Öðrenci\n");

		} else {
			System.out.println("Adý:" + user.getFullName()+"\ne-Mail : "+ user.geteMail() + "\nKullanýcý : Tipi Eðitmen\n");
		}

	}

}
