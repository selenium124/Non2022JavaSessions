package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.name = "Lavanya";
		e1.age = 36;
		e1.setSalary(66.34);
		
		System.out.println(e1.getSalary() + " "+ e1.name + " " + e1.age);
		
//		Company c1 = new Company();
//		c1.setName("Ramya");
//		c1.setEmpCount(10);
//		c1.setSharePrice(23);
//		
//		System.out.println(c1.getName() + " " + c1.getEmpCount() + " " + c1.getSharePrice());
		
		//Post Call
		Company c1 = new Company("Tej",15, 32);
		
		//Get Call
		System.out.println(c1.getName() + " " + c1.getEmpCount() + " " + c1.getSharePrice());
		
		//Put call
		c1.setName("Ramya");
		c1.setEmpCount(200);
		System.out.println(c1.getName() + " " + c1.getEmpCount() + " " + c1.getSharePrice());
		
		//register:
		RegisterPage reg = new RegisterPage("Tom", 25, "Bangalore 566611", "01-01-1990");
		
		System.out.println(reg.getName());
		System.out.println(reg.getDob());
		System.out.println(reg.getAddress());

		
		reg.setAddress("Pune 456677");
		System.out.println(reg.getName());
		System.out.println(reg.getAddress());
		
		
		RegisterPage reg1 = new RegisterPage("Ravi", 30);
		reg1.setDob("02-02-1987");
		reg1.setAddress("Delhi");
		System.out.println(reg1.getName());
		System.out.println(reg1.getDob());
		System.out.println(reg1.getAddress());
		
		//
		Browser br = new Browser();
		br.launchBrowser();
		
		
		
		

	}

}
