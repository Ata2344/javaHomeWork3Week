package kodlama;

public class InstructorManager {
	public void addInstructor(Instructor instructor) {
		System.out.println("Eðitmen eklendi."+instructor.fullName);
	}
	
	public void listInstructor(Instructor instructor) {
		System.out.println("Adý : " + instructor.getFullName() + "\nNumarasý : "
				+ instructor.getInstructorNumber() + "\nMail : " + instructor.geteMail()+"\n");
	}
}
