
public class Student extends User {

	private String courseTaken;

	public Student(int id, String name, String surname, String kullaniciadi, String courseTaken) {
		super(id, name, surname, kullaniciadi);
		this.courseTaken = courseTaken;
	}

	public String getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
	}
}