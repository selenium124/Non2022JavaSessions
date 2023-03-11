package OOP_Constructor;

public class LoginTest {

	public static void main(String[] args) {
		
		Login lp1 = new Login("admin@gmail.com","admin@123");
		if (lp1.doLogin()) {
			System.out.println("display the menu items");
		}
		
		Login lp2 = new Login("testmail@gmail.com", "testmail@123");
		System.out.println(lp2.userName);
		System.out.println(lp2.password);
		
		Login lp3 = new Login("Automation@gmail.com","Automation@123");

	}

}
