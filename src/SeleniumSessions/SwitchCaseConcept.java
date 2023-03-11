package SeleniumSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "Safari";
		
		switch (browser) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "Firefox":
			System.out.println("Firefox is launched");
			break;
		case "Safari":
			System.out.println("Safari is launched");
			break;
		case "ie":
			System.out.println("ie is launched");
			break;	

		default:
			System.out.println("Invalid browser... Please give the valid browser");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;	
		}
		
		//
		int marks = 10;
		switch (marks) {
		case 90:
			System.out.println("A Grade");
			break;
		case 80:
			System.out.println("B Grade");
			break;
		case 70:
			System.out.println("C Grade");
			break;
		case 60:
			System.out.println("D Grade");
			break;	

		default:
			System.out.println("Fail");
			break;
		}
		
		//
//		float f=75.5f;
//		switch (f) {
//		case 67.8:
//			System.out.println();
//			break;
//
//		default:
//			break;
//		}
		//
		char ch='4';
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;	

		default:
			System.out.println("not a vowel");
			break;
		}
		
		//byte, short, int, String, char
		byte num=100;
		switch (num) {
		case 90:
			
			break;

		default:
			break;
		}
		
		//real time switch case use cases:
		//1. cross browser logic
		//2. ecom - multiple counties - laguage
		//3. multi environment: DEV, QA, STAGE, UAT, PROD
		//4. API methods: GET, POST, PUT, DELETE
		//5. DropDown : Single, Multiple, All
		//6. Payment Methods: CC, UPI, PayPal, Xoom, Bank

	}

}
