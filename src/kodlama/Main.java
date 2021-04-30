package kodlama;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFullName("Öğrenci1");
		student1.seteMail("Mail1@mail.com");
		student1.setPassword("******");
		student1.setStudentNumber("5000001");
		student1.setInstructor(false);

		Student student2 = new Student();
		student2.setId(2);
		student2.setFullName("Öğrenci2");
		student2.seteMail("Mail@mail.com");
		student2.setPassword("******");
		student2.setStudentNumber("5000002");
		student2.setInstructor(false);

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFullName("Öğretmen1");
		instructor1.seteMail("gmail@gmail.com");
		instructor1.setPassword("engin");
		instructor1.setInstructorNumber("1000001");
		instructor1.setInstructor(true);

		Instructor instructor2 = new Instructor();
		instructor2.setId(1);
		instructor2.setFullName("Öğretmen2");
		instructor2.seteMail("gmail1@gmail.com");
		instructor2.setPassword("******");
		instructor2.setInstructorNumber("1000002");
		instructor2.setInstructor(true);

		Student[] students = { student1, student2 };
		for (Student student : students) {
			System.out.println("----Student----");
			StudentManager studentManager = new StudentManager();
			studentManager.listStudent(student);
			
		}
		
		
		Instructor[] instructors = { instructor1, instructor2 };
		for (Instructor instructor : instructors) {
			System.out.println("----Instructor----");
			InstructorManager instructorManager = new InstructorManager();
			instructorManager.listInstructor(instructor);
			
		}

		
		User[] users = {student1,student2,instructor1,instructor2};
		for (User user : users) {
			System.out.println("----User----");
			UserManager userManager = new UserManager();
			userManager.addUser(user);
			
		}
		
		
		
	
	}

}
