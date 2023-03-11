package SeleniumSessions;

public class LoopConcept {

	public static void main(String[] args) {
		
		//1. while
		int i=1;
		while(i<=10) {
			System.out.println(i); // without condition it prints 1 infinite times
			i++;
		}
		//
		while(true) {
			System.out.println("Welcome to Taj Hotel");
			break;
		}
		//
		int p=1;
		while(p<=100) {
			System.out.println(p);
			p=p+2;
		}
		//
		int num=1;
		while(num<=100) {
			System.out.println(num);
			if(num % 5 == 0) {
				System.out.println("Hi");
				break; // breaks the entire while loop
			}
			num++;
		}
		//
		int n=1;
		while(n<=5) {
			System.out.println(n+" = "+"Ramya");
			n++;
		}
		//
		int counter = 100;
		while(counter>=100) {
			System.out.println(counter);
			if(counter==200) {
				System.out.println("Bye");
				break;
			}
			counter++;
		}
		//
		int score=0;
		while(score<=100) {
//			System.out.println(score);
//			if(score==25) {
//				System.out.println("your score is 25");
//			}
//			if(score==50) {
//				System.out.println("Half Century");
//			}
//			if(score==100) {
//				System.out.println("Century");
//			}
			switch(score) {
			case 25:
				System.out.println(score);
				System.out.println("your score is 25");
				break;
			case 50:
				System.out.println(score);
				System.out.println("Half Century");
				break;
			case 100:
				System.out.println(score);
				System.out.println("Century");
				break;
			default:
				System.out.println(score);
				break;
			}
			score++;	
			
		}
		
//		int num5 = 0;
//		while (num5<=100) {		
//			if (num5%5==0) {				
//				System.out.println("this is mutipule of 5 -->"+num5);				
//			}
//			 num5++;
//		}


//int num6 = 0;
//		while (num6<=100) {
//		
//			if (num6%5==0) {
//				System.out.println("this is mutipule of 5 -->"+num6	);
//				num6++;
//				break;
//				}
//			
//		}
			

	}

}
