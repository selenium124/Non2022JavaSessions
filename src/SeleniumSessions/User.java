package SeleniumSessions;

public class User {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User();
		u1.name="Ramya";
		u1.age=34;
		u1.city="Bangalore";
		
		User u2=new User();
		u2.name="Jishna";
		u2.age=5;
		u2.city="Chennai";
		
		User u3=new User();
		u3.name="Kishore";
		u3.age=36;
		u3.city="Hyderabad";
		
		//u1=u2=u3;
		System.out.println(u1.name);
		System.out.println(u2.name);
		System.out.println(u3.name);
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u1=u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u2=u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u3=u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
//		u1=u2=u3;
//		System.out.println(u1.name + " " + u1.age + " " + u1.city);
//		System.out.println(u2.name + " " + u2.age + " " + u2.city);
//		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		

	}

}
