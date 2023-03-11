package SeleniumSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BIG O:O(n)
		
		int i=1;
		System.out.println(i);
		
		//O(1)
		
		String s="Hello";
		System.out.println(s);
		
		//O(1)
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		//O(1)
		
		for(int p=1;p<=10;p++) {
			System.out.println(p);
		}
		
		//O(n)
		//O(n/n')
		//1+n+n+n => 1+3n => 3n+1 -- linear equation
		// 3n+1 => 3n => O(3n) => O(n)
		
		//
		for(int q=100;q<=1000;q++) {
			for(int r=1;r<=10;r++) {
				System.out.println("Hi");
			}
		}
		
		//(1+n+n)(1+n+n+n)
		//(1+2n)(1+3n) => 1+3n+2n+6n^2 => 6n^2+5n+1 => Quadratic equation: n^2+n+1
		//6n^2+5n+1 => 6n^2+5n => n(6n+5) => n(6n) => 6n^2 => n^2 => O(n^2)
		
		for(int p=1; p<=10000000;p++) {
			System.out.println(p);
		}//n
		
		for(int p=1; p<=10000000;p++) {
			System.out.println(p);
		}//n
		
		// n+n => 2n => n => O(n)
		
		for(int q=1;q<=10;q++) {
			for(int r=1;r<=10;r++) {
				for(int t=1;t<=10;t++) {
				System.out.println("Hi");
				}
			}
		}
		
		//(1+n+n)(1+n+n)(1+n+n) => O(n^3)

	}

}
