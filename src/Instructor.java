
public class Instructor extends User {

	private String teachCourse;
	
	public Instructor(int id, String name, String surname, String kullaniciadi, String teachCourse) {
		super(id, name, surname, kullaniciadi);
		this.teachCourse = teachCourse;
	}

	public String getTeachCourse() {
		return teachCourse;
	}

	public void setTeachCourse(String teachCourse) {
		this.teachCourse = teachCourse;
	}



}
