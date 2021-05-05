
public class UserManager {

	public void addUser(User user) {

		System.out.println(user.getName() + " " + user.getSurname() + " isimli üye " + user.getKullaniciadi()+ " kullanýcý adý ile baþarýlý bir þekilde kayýt oldu!!");

	}

	public void deleteUser(User user) {

		System.out.println(user.getKullaniciadi() + " isimli kullanýcý silindi!!");

	}

}