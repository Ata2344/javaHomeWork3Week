package kodlama;

public class InstructorManager {
	public void addInstructor(Instructor instructor) {
		System.out.println("E�itmen eklendi."+instructor.fullName);
	}
	
	public void listInstructor(Instructor instructor) {
		System.out.println("Ad� : " + instructor.getFullName() + "\nNumaras� : "
				+ instructor.getInstructorNumber() + "\nMail : " + instructor.geteMail()+"\n");
	}
}
