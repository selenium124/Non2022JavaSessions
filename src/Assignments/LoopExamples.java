package Assignments;

public class LoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Printing 5 times
		int i=1;
		while(i<=5) {
			System.out.println("I am Batman");
			i++;
		}
		System.out.println("--------------");
		
		//2.Printing 5 times with int value
		int j=1;
		while(j<10) {
			System.out.println("I am Batman"+" "+j);
			j++;
		}
		
		//3.Printing 10 to 1 using whole loop
		System.out.println("----------------");
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		
		//4. print "Hello World" ten times using while loop
		System.out.println("----------------");
		int l=1;
		while(l<=10) {
			System.out.println("Hello World");
			l++;
		}
		
		//5.program in Java to print 1 to 10 using while loop
		System.out.println("-----------------");
		int m=1;
		while(m<=10) {
			System.out.println(m);
			m++;
		}
		
		//6. find out the max number from the given three different positive numbers.
		System.out.println("-----------------");
		int num1=400;
		int num2=200;
		int num3=300;
		if(num1>num2 && num1>num3) {
			System.out.println("The max number is " + num1);
		}
		else if(num2>num3) {
			System.out.println("The max number is " + num2);
		}
		else {
			System.out.println("The max number is " + num3);
		}
		
		//7.print all odd and even numbers between 1 to 100
		System.out.println("------------------");
		int p=1;
		int p1=1;
		System.out.println("The even numbers are");
		while(p<=100) {
			//System.out.println("The even numbers are");
			if(p%2==0) {
				System.out.println(p);
			}
			
			p++;
		}
		System.out.println("The odd numbers are");
		while(p1<=100) {
			//System.out.println("The odd numbers are");
			if(p1%2!=0) {
				System.out.println(p1);
			}
			
			p1++;
		}
		
		//9a.Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop
		System.out.println("------------");
		char lc='a';
		char uc='A';
		char num='1';
		while(lc<='z') {
			System.out.println((int)lc + ":" + lc);
			lc++;
		}
		
		while(uc<='Z') {
			System.out.println((int)uc + ":" + uc);
			uc++;
		}
		
		while(num<='9') {
			System.out.println((int)num + ":" + num);
			num++;
		}
		//9b.Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop
		for(;lc<='z';lc++) {		
		
			System.out.println((int)lc + ":" + lc);
			
		}
		for(;uc<='Z';uc++) {
		
			System.out.println((int)uc + ":" + uc);
			
		}
		
		for(;num<='9';num++) {
			System.out.println((int)num + ":" + num);
			
		}
		//10. Print the following series: 1.0 2.0 3.0  ...... 10.0 and 0 5 10 15 20 25 …. 100
		System.out.println("-------------");
		for(float f1=1.0f;f1<=10.0;f1++) {
			System.out.println(f1);
			
		}
		for(int p2=0;p2<=100;p2++) {
			if(p2%5==0) {
				System.out.println(p2);
			}
			
		}
		//11.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘
		System.out.println("------------");
		char vowels='a';
		while(vowels<='z') {
			switch (vowels){
			case 'a':
				System.out.println("a is a vowel");
				break;
			case 'e':
				System.out.println("e is a vowel");
				break;
			case 'i':
				System.out.println("i is a vowel");
				break;
			case 'o':
				System.out.println("0 is a vowel");
				break;
			case 'u':
				System.out.println("u is a vowel");
				break;
			default:
				break;
									
			}
			vowels++;
				
		}
		//12. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		System.out.println("------------");
		int num4=1;
		while(num4<=10) {
			System.out.println(num4);
			{
				if(num4%7==0) {
					System.out.println("bye, see you tomorrow");
					break;
				}
				num4++;
			}
		}
		//13.Write a cricket score card system using for and while loops:
		System.out.println("-----------");
		for(int score=0;score<=100;score++) {
			if(score == 0) {
				System.out.println("Zero - duck");
			}
			if(score == 25) {
				System.out.println("good job");
			}
			if(score == 50) {
				System.out.println("good job - Half Century");
			}
			if(score == 100) {
				System.out.println("good job - Century");
			}
		}
		
		System.out.println("-----------");
		int cricscore=0;
		while(cricscore<=100) {
			if(cricscore == 0) {
				System.out.println("Zero - duck");
			}
			if(cricscore == 25) {
				System.out.println("good job");
			}
			if(cricscore == 50) {
				System.out.println("good job - Half Century");
			}
			if(cricscore == 100) {
				System.out.println("good job - Century");
			}
			cricscore++;
			
		}
		
				






	}

}
