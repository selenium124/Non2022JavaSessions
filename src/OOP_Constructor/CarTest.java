package OOP_Constructor;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car("BMW", "White");
		Car c2 = new Car("Audi", "Blue", 60);
		Car c3 = new Car("Ferari", "Red", 100, true);
		//Car c4 = new Car("Honda",20, false);
		
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.isAutomatic);
		System.out.println(c3.name + " " + c3.color + " " + c3.price + " " + c3.isAutomatic);

	}

}
