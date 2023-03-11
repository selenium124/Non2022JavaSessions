package Assignments;

public class IntegerReverse {
	
	public static int reverseInt(String num) {
		if(num == null) {
			System.out.println("null is not allowed....please pass the right value");
			return -1;
		}
		int len = num.length();//1	
		//length check, if len  = 1
//		if(len == 1) {
//			return num;
//		}
		
		int rev = 0;
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + num.charAt(i);//N
			
		}

		return rev;
	}

	public static void main(String[] args) {
		
		int r1 = reverseInt("1234");
		System.out.println(r1);
		
//		r1 = reverseInt("Selenium Automation");
//		System.out.println(r1);
//		
//		r1 = reverseInt("10011");
//		System.out.println(r1);
//		
//		r1 = reverseInt("N");
//		System.out.println(r1);
//		
//		r1 = reverseInt(null);
//		System.out.println(r1);
//		
//		r1 = reverseInt("TT");
//		System.out.println(r1);
		
	}
		

		
	
	
	

}
