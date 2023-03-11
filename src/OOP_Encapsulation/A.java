package OOP_Encapsulation;

import java.util.Arrays;

public class A {
	
	public void t1() {
		String s[] = {"naveen"};
		System.out.println(Arrays.toString(s));
		//A.main(s);
	}
	
	
	

	public static void main(String[] args) {

		A a = new A();
		a.t1();
		B.main(args);
		
		
	}

}
