package SeleniumSessions;

public class NestedLoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		
		//50 51 52 53 53 55
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
			System.out.print(i+ ""+ j +" ");
			
		}
			System.out.println();
		}
		
		System.out.println("----------");
		// 000 001 002 003 004 005
		for(int k=0;k<1;k++) {
			for(int l=0;l<1;l++) {
				for(int m=0;m<=5;m++) {
					System.out.print(k + ""+l+""+m+" ");
				}
				System.out.println();
			}
		}
		System.out.println("---------");
		
		for(int k=0;k<=5;k++) {
			for(int l=0;l<=5;l++) {
				for(int m=0;m<=5;m++) {
					System.out.print(k + ""+l+""+m+" ");
					//break;
					
				}
				System.out.println();
				//break;
			}
			//break;
		}
		
		//BIG O(n^3)

	}

}
