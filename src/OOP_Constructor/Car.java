package OOP_Constructor;

public class Car {
	
	String name;
	String color;
	int price;
	boolean isAutomatic;
	
	public double getCarMileage() {
		double a=12.22;
		double b=13.33;
		double mg = a+b;
		return mg;
		
	}
	
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}


	public Car(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}


	public Car(String name, String color, int price, boolean isAutomatic) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAutomatic = isAutomatic;
	}
	
	
	
	
	
	

}
