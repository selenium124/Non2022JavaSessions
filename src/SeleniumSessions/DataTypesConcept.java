package SeleniumSessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='2';
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b=10;
		b=30;
		byte b1=20;
		byte b2= 40;
		byte t1=1;
		byte age=40;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b1+b2);
		
		//2. short:
		//size: 2 bytes = 2*8=16 bits
		//range: -32768 to 32767
		short sh= 500;
		short sh1=-300;
		short sh2= 3000;
		short sh3=3000;
		//short sh4=sh2*sh3;
		System.out.println(sh2*sh3);
		System.out.println(sh+sh1);
		
		//3. int:
		//size: 4 bytes = 4*8= 32 bits
		//range: -2147483648 to 2147483647
		int i= 100000;
		int j= 1; // 4 bytes
		int k= 3000;
		byte l= 20;
		System.out.println(k+l);
		
		//4. long:
		//size: 8 bytes = 8*8= 64 bits
		//range:
		long num= 9945829382l;
		long n= 9876543217L;
		System.out.println(n);
		System.out.println(num*n);
		
		//5. float:
		//size: 4 bytes = 4*8= 32 bits
		//range: upto 7 digits after decimal
		float f1= 12.33f;
		System.out.println(f1);
		float f2= (float)23.44;
		System.out.println(f2);
		float f3= 100;
		System.out.println(f3);
		float f4 = 1.1f;
		float f5 = 0.9f;
		
		//6. double:
		//size: 8 bytes = 8*8 = 64 bits
		//range: upto 16 digits after decimal
		double d= 12.435678965;
		double d1= 200;
		System.out.println(d1);
		System.out.println(d);
		
		//7. char:
		//size: 2 bytes = 2*8 = 16 bits
		char c1='a'; //a-z
		char c11='b';
		char c2='1'; //0-9
		char c3='A'; //A-Z
		char c4='%';
		char gender = 'F';
		char Status = 'Y';
		System.out.println(c1);//a
		System.out.println(c1+c11);//97+98 = 195
		System.out.println(c11-c1);
		//ASCII value -- table
		//a-z: 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		char r1= '0'; //48
		char r2= '9'; //57
		System.out.println(r1+r2); //105
		System.out.println(r1 * r2); //2736
		System.out.println(r1); //0
		//System.out.println((int)r1+r2); //105
		char u1='a';
		char u2='b';
		System.out.println(u1+""+u2); //ab
		System.out.println((int)u1); //97
		System.out.println((byte)u2); //98
		
		System.out.println((int)u1+(int)u2); //105
		System.out.println(u1+u2); //105
		System.out.println(u1); //a
		System.out.println(u1+0); //97
		System.out.println(u1+'0'); //145
		
		//8. boolean
		//size: ~1 bit
		boolean bn1=true;
		boolean bn2=false;
		System.out.println(bn1);
		
		
		//without declaring the variables also used but it is not recommended
		
		System.out.println(1+2);
		System.out.println('a'+'b');
		System.out.println(100);
		System.out.println(1);
		
				
		
		
				
				
		
		
		
		
		
				



	}

}
