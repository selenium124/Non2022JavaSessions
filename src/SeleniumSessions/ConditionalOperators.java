package SeleniumSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		int j=20;
		if(i==j) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not eqaul");
		}
		
		if(j>=i) {
			System.out.println("j is greater than i");
		}
		else {
			System.out.println("i is greater than j");
		}
		
		//> >= < <= == !=
		
		int total =100;
		if(total!=100) {
			System.out.println("bye");
		}
		else {
			System.out.println("Hi");
		}
		
		//nested if
		int marks=90;
		if(marks<=100) {
			System.out.println("valid marks");
			if(marks>=90) {
				System.out.println("A Grade");
				if(marks>=95) {
					System.out.println("eligible for scholarship");
					if(marks==100) {
						System.out.println("100% fee waived off");
					}
				}
			}
		
		else {
			if(marks<=80) {
				System.out.println("B grade");
			}
		}
		}
		else {
			System.out.println("not a valid marks");
		}
		
		//if if if if else
		String browser = "Firefox";
		if(browser.equals("Chrome")){
			System.out.println("Chrome is Launched");
		}
		if(browser.equals("Firefox")) {
			System.out.println("Firefox is Launched");
		}
		if(browser.equals("Safari")) {
			System.out.println("Safari is Launched");
		}
		else {
			System.out.println("Not a valid browser");
		}
		
		//if-elseif
		String browser1="Safari";
		if(browser1.equals("Chrome")){
			System.out.println("Chrome is Launched");
		}
		else if(browser1.equals("Firefox")) {
			System.out.println("Firefox is Launched");
		}
		else if(browser1.equals("Safari")) {
			System.out.println("Safari is Launched");
		}
		else {
			System.out.println("Not a valid browser");
		}
		
		

	}

}
