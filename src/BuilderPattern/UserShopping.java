package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {
		
		EcommApplication app = new EcommApplication();
		app.login("ramya.j@gmail.com", "ramya@123")
			.doSearch("ipad pro 11")
			.addToCart("ipad pro 11")
			.doPayment("1211 2344 1222 3445", "123")
			.generateOrder()
			.logout();
		
		
		System.out.println("------");
		//
		app.login("ramya.j@gmail.com", "ramya@123")
			.doSearch("SweatShirt", 4000, "Nike")
				.addToCart("SweatShirt")
					.logout();
		
		System.out.println("------");
		app.login("ramya.j@gmail.com", "ramya@123")
			.addToCart("tshirt")
				.doPayment("ramya.j@gmail.com")
					.generateOrder()
							.logout();
		
		
		System.out.println("------");
		app.login("ramya.j@gmail.com", "ramya@123")
			.logout();
		
		
		//
		EcommApplication app1 = new EcommApplication();


		
	}
	

}
