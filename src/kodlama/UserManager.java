package kodlama;

public class UserManager {

	public void addUser(User user) {
		
		if (user.isInstructor() == false) {
			System.out.println("Ad�:" + user.getFullName()+"\ne-Mail : "+ user.geteMail() + "\nKullan�c� : Tipi ��renci\n");

		} else {
			System.out.println("Ad�:" + user.getFullName()+"\ne-Mail : "+ user.geteMail() + "\nKullan�c� : Tipi E�itmen\n");
		}

	}

}
