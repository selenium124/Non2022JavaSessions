package MethodCalling;

public class Employee {
	
	String name;
	int age;
	
	public int add(int a, int b) {
		System.out.println("The sum of two numbers are");
		int sum = a+b;
		return sum;
	}
	
	public void getInfo(Employee emp) {
		emp.name= "Ramya";
		emp.age=30;
		System.out.println(emp.name + " " + emp.age);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		//int sum=e1.add(10, 20); // call by value
		//int sum;
		//System.out.println(sum);
		System.out.println(e1.name + " " + e1.age);
		e1.name = "Syam";
		e1.age = 50;
		System.out.println(e1.name + " " + e1.age);
		e1.getInfo(e1);
		System.out.println(e1.name + " " + e1.age);
		
		

	}

}
