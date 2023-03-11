package OOP_Encapsulation;

public class Application {
	
	String name;
	
	public void m1() {
		
		//to call static method from non static method no need to create object
		// to call within the non static method no objects required
		
		t2	();
		System.out.println("m1 method");
		name = "Ramya";
		System.out.println(name);
		m2();
	}
	
	public void m2() {
		
		System.out.println("m2 method");
		name="Kishore";
		m3();
		
	}
	
	public void m3() {
		
		System.out.println("m3 method");
	}
	
	public static void t1() {
		
		// to call non static method from static method objects creation is required
		// to call any static method object creation is not required
				
		Application a1 = new Application();
		a1.m1();
		a1.name = "Tom";
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
		
	}
	
	public static void t3() {
		System.out.println("t3 m3thod");
	}

	public static void main(String[] args) {
		
		Application ap1 = new Application();
		ap1.m1();
		System.out.println(ap1.name);
		
		Application.t1();

	}

}
