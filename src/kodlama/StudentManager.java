package kodlama;

public class StudentManager  {
	public void addStudent(Student student) {

		System.out.println("��renci eklendi." + student.fullName);
	}

	public void listStudent(Student student) {

		System.out.println("Ad� : " + student.getFullName() + "\nNumaras� : "
				+ student.getStudentNumber() + "\nMail : " + student.geteMail()+"\n");

		

	}

}
