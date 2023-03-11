package OOP_Constructor;

public class Login {
	
	String userName;
	String password;
	
	public Login(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public boolean doLogin() {
		System.out.println("enter username: " + userName);
		System.out.println("enter password: " + password);
		System.out.println("Click on login in button");
		System.out.println("user is logged in");
		return true;
	}

}
