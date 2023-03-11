package OOP_Constructor;

public class Employee {
	
	// const... is not a function but it looks like a function
	// const... is having the same name as class name
	// const... can not return anything -- no return type for const...
	// const... is helping to control the object creation
	// const.. will be called when you create the object
	// const.. overloading is possible in Java
		

	// default const... 0 param
	
	public Employee() {
		System.out.println("default Constructor");
	}
	
	public Employee(int a) { //1 Param const
		System.out.println("1 param const " + a);
	}
	
	public Employee(int a, int b) { //2 param const
		System.out.println("2 param const " + (a+b));
	}

	public static void main(String[] args) {

		Employee emp=new Employee();
		Employee emp1=new Employee(10);
		Employee emp2=new Employee(10,20);
		

	}

}
