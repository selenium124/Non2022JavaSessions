package SeleniumSessions;

public class Employee {
	
	//class: category of Objects, blueprint/template of objects
	// object is the physical entity
	
	//class vars:
	String name;
	int age;
	String city;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the object of the class using new keyword
		
		Employee e1=new Employee();
		e1.name="Tom";
		e1.age=32;
		e1.city="LA";
		e1.salary=23.45;
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary);
		
		Employee e2=new Employee();
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		
		Employee e3=new Employee();
		e3=null;//Null reference object
		e3.name="Ramya";//NPE
		
		e3=new Employee(); 
		
		//Object without reference
		new Employee().name="Naveen";
		new Employee().age=34;
		new Employee().salary=45.78;
		new Employee().city="Bangalore";
		
		System.gc(); //This is to call garbage collector but not used in Java mostly
		// naveen tom naveen ravi naveen
				// c = 0
				// e.equals(naveen)--> c++
				// print - c
		
		
		
		

	}

}
