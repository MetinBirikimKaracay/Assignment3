
public class Main {

	public static void main(String[] args) {

		Student ogrenci = new Student(1, "Metin", "Kara�ay", "MetinKaracay", "Java");

		Instructor hoca = new Instructor(10, "Engin", "Demiro�", "EnginDemirog", "Java");

		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();

		instructorManager.teachCourses(hoca);
		System.out.println("-------------------------------");
		studentManager.Courses(ogrenci);
		System.out.println("-------------------------------");
		instructorManager.addUser(hoca);
		System.out.println("-------------------------------");
		studentManager.deleteUser(ogrenci);

	}

}
