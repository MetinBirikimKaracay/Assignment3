
public class UserManager {

	public void addUser(User user) {

		System.out.println(user.getName() + " " + user.getSurname() + " isimli �ye " + user.getKullaniciadi()+ " kullan�c� ad� ile ba�ar�l� bir �ekilde kay�t oldu!!");

	}

	public void deleteUser(User user) {

		System.out.println(user.getKullaniciadi() + " isimli kullan�c� silindi!!");

	}

}