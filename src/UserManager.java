
public class UserManager {
public void Add(User user) {
	System.out.println("IKullanýcý adý: " + user.name);
	System.out.println("Kullanýcý þifre: " + user.password);
	System.out.println("Kullanýcý e-mail: " + user.eMail + "\nKullanýcý eklendi");
	
}
public void Delete (User user) {
	System.out.println("IKullanýcý adý: " + user.name);
	System.out.println("Kullanýcý þifre: " + user.password);
	System.out.println("Kullanýcý e-mail: " + user.eMail + "\nKullanýcý silindi");
}

}
