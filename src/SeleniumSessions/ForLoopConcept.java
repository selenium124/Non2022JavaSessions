package SeleniumSessions;

public class ForLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 to 10
		int i=1;
		for(;i<=10;i++) {
			System.out.println(i);
		}
		
		for(;;) {
			System.out.println("Bye");
			break;
		}
		
//		for(;false;) {
//			System.out.println("Bye");
//		}
		
		System.out.println("-----------");
		//5 to 50
		for(int j=5;j<=50;j++) {
			System.out.println(j);
			if(j%5==0) {
				System.out.println("Hiii");
				break; // breaks the entire loop
			}
		}
		
		System.out.println("-------");
		//a to z
		for(char c='a';c<='z';c++) {
			//System.out.println(c);
			System.out.println((int)c + ":" + c);
		}
		for(byte b=1;b<=5;b++) {
			System.out.println(b);
		}
		
		//
		System.out.println("---------");
		for(double d=1.1;d<=10.0;d++) {
			System.out.println(d);
		}
		
		System.out.println("----------");
		for(String s="Ramya";s.equals("Ramya");) {
			System.out.println("Hi" + s);
			break;
		}
		
		//Use cases of For loop
		//numbers of iterations are fixed
		//month drop down: jan to dec
		//ecomm: Category iterations
		//country

	}

}
