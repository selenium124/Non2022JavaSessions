package OOP_Constructor;

public class User {
	//class variables
	String name;
	int age;
	String email;
	String password;
	String phone;
	
	static String price;
	
	public boolean forgotPwd() {
		//buss logic
		return true;
	}
	
	//hidden constructor -- default const, this will be added by JVM
	
//	public User(String name, String password) {
//		this.name = name;
//		this.password = password;
//	}
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public User(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public User(String name, int age, String email, String password) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	public User(String name, int age, String email, String password, String phone) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	

	public static void main(String[] args) {
		
		User u1 = new User("Ramya", 33);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.email);
		
		User u2 = new User("Ramya", 33, "ramyakishore@gmail.com");
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.email);
		System.out.println(u2.password);
		System.out.println(u2.phone);
		
		User u3 = new User("Ramya", 33, "ramyakishore@gmail.com", "ramya@123", "9090909090");
		System.out.println(u3.name + " " + u3.phone);

	}

}
