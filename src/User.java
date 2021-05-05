
public class User {

	private int id;
	private String name;
	private String surname;
	private String kullaniciadi;

	public User(int id, String name, String surname, String kullaniciadi) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.kullaniciadi = kullaniciadi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getKullaniciadi() {
		return kullaniciadi;
	}

	public void setKullaniciadi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}
}