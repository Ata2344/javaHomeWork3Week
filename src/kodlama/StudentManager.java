package kodlama;

public class StudentManager  {
	public void addStudent(Student student) {

		System.out.println("Öğrenci eklendi." + student.fullName);
	}

	public void listStudent(Student student) {

		System.out.println("Adı : " + student.getFullName() + "\nNumarası : "
				+ student.getStudentNumber() + "\nMail : " + student.geteMail()+"\n");

		

	}

}
