
public class UserManager {
public void Add(User user) {
	System.out.println("IKullan�c� ad�: " + user.name);
	System.out.println("Kullan�c� �ifre: " + user.password);
	System.out.println("Kullan�c� e-mail: " + user.eMail + "\nKullan�c� eklendi");
	
}
public void Delete (User user) {
	System.out.println("IKullan�c� ad�: " + user.name);
	System.out.println("Kullan�c� �ifre: " + user.password);
	System.out.println("Kullan�c� e-mail: " + user.eMail + "\nKullan�c� silindi");
}

}
