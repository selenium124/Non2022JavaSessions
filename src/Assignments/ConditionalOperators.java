package Assignments;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find out the greatest number out of three different given numbers:
		int num1=25;
		int num2=78;
		int num3=87;
		if(num1>num2 && num1>num3) {
			System.out.println("The greatest:" + num1);
		}
		else if(num2>num3) {
			System.out.println("The greatest:" + num2);
			
		}
		else {
			System.out.println("The greatest:" + num3);
		}
		//2.Write a Java program to test a number is positive or negative.
		int num4=35;
		int num5=-11;
		if(num4>0) {
			System.out.println(num4 + " is positive number");
		}
		if(num5<0) {
			System.out.println(num5 + " is negative number");
		}
		boolean flag = true;
		int num=15;
		for(int i=2;i<num;i++) {
				if(num%i==0) {
				flag=false;
				break;
				}
		}	
		if(flag) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		//Factorial
		int fact=1;
		int num6=7;
		for(int i=1; i<=num6; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
//		//Fibonacci series
//		int fib=1;
//		
//		System.out.print(fib);
//		int num7=8;
//		for(int j=1;j<=num7;j++) {
//			int k=fib+j;
//			fib=k;
//			
//			System.out.print(fib);
//		}
		

	}

}
