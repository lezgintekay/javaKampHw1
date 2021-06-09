
public class User {

	int password ; 
	String eMail;
	String name ; 
	
	public User(String name,  int password, String eMail) {
		this.name= name ; 
		this.password = password ; 
		this.eMail= eMail ; 
	System.out.println("Kullanýcý" + name + "\nKullanýcý Eklendi"  );
	}
}
