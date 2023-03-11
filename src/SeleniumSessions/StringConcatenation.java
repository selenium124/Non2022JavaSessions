package SeleniumSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String x="Hello";
		String y="World";
		
		int a=100;
		int b=200;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x+a); //Hello100
		System.out.println(a+b+x+y); //300HelloWorld
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(x+y+(a+b)); //HelloWorld300
		System.out.println(a+b+x+y+a+b); //300HelloWorld100200
		
		double d1=12.33;
		double d2=22.44;
		System.out.println(x+y+d1+d2); // HelloWorld12.3322.44
		
		System.out.println("The value of a is:" +a);
		System.out.println("The value of b is:" +b);
		System.out.println("The sum is:" +(a+b));
		
		System.out.println(1200);
		String ph="9036829282";
		String ph1="+00188679876";
		String s1="678976543214678900098876655443";
		
		String s2="98";
		int pp= Integer.parseInt(s2)+1;
		System.out.println(pp);
		

	}

}
