package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcept {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayConcept obj=new ArrayConcept();
		//Array: static array: size is fixed
		//collection of elements with the same type
		
		//limitations of Array:
		//Size is fixed: static array: to overcome this we have to use dynamic array(Array List)
		//only similar type of data can be stored: to overcome this issue we can use Object static array
		//li=0;
		//len=4;
		//hi=len-1;
		//len=hei+1
		
		int i[]=new int[4];
		System.out.println(i.length);
		int len=i.length;
		int hi=len-1;
		int li=0;
		System.out.println(hi);
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//i[4]=50;//AIOB
		
		System.out.println(i[0]);
		System.out.println(i[2]);
		//System.out.println(i[4]);
		//System.out.println(i[-1]);
		
		//to print all the values from array:
		//index based loop
		for(int k=0; k<=i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("----------");
		//to print all the values from array without loop
		System.out.println(Arrays.toString(i)); //[10, 20, 30, 40]
		
		System.out.println("------");
		//for each:
		for(int e:i) {
			System.out.println(e);
			if(e==20) {
				System.out.println("Bye");
				break;
			}
		}
		
		System.out.println(i);//give array address
		
		int p[]=new int[4];
		p[2]=40;
		System.out.println(p[0]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		
		System.out.println(Arrays.toString(p));//[0, 0, 40, 0]
		
		//2. double Array
		double d[]=new double[4];
		d[0]=12.11;
		d[1]=13.11;
		d[2]=14.11;
		d[3]=15.11;
		System.out.println(d[1] + d[2]);
		System.out.println(Arrays.toString(d));
		for(double e:d) {
			System.out.println(e);
		}
		
		//3. char Array
		char c[]=new char[4];
		c[0]='a';
		c[1]='z';
		c[2]='0';
		c[3]='&';
		System.out.println(Arrays.toString(c));
		System.out.println(c.length);
		System.out.println(c.length-1);
		System.out.println("li=" + 0);
		
		for(char e:c) {
			System.out.println(e);
		}
		
		//4.String Array
		String lang[]=new String[4];
		lang[0]="Java";
		lang[1]="Python";
		lang[2]="JavaScript";
		lang[3]="DotNet";
		System.out.println(lang.length);
		
		System.out.println(Arrays.toString(lang));
		
		for(String e:lang) {
			System.out.println(e);
			if(e.equals("Java")) {
				System.out.println("I Love Java");
			}
			if(e.equals("DotNet")) {
				System.out.println("I hate " + e);
			}
		}
		
		System.out.println("---------");
		
		//Object Array:
		//Object is a class in Java -- is a super class of all the classes in Java
		
		//Emp Info: Name(String), age(int), salary(double), gender(char), isPermanent(Boolean)
		
		Object emp[]=new Object[5];
		emp[0]="Ramya";
		emp[1]=33;
		emp[2]=34.87;
		emp[3]='F';
		emp[4]=true;
		System.out.println(emp.length);
		for(Object e:emp) {
			System.out.println(e);
			if(e.equals("Ramya")) {
				System.out.println("QA Emp");
			}
		}
		
		System.out.println("--------");
		Object emp1[]=new Object[5];
		emp1[0]="Kishore";
		emp1[1]=36;
		emp1[2]=56.66;
		emp1[3]='M';
		emp1[4]=true;
		for(int l=0;l<=emp1.length-1;l++) {
			System.out.println(emp1[l]);
			if(emp1[l]=="Kishore") {
				System.out.println("Employee is from dev");
			}
			
		}
		
		//static
		//1.new keyword
		//2. array literals
		int num[]= {11,32,12,45,67,76,889,987};
		System.out.println(Arrays.toString(num));
		
		String pr[]= {"iPhone", "macbook","Samsung"};
		System.out.println(Arrays.toString(pr));
		
		Object data[]= {"macbook",1000, 23.44, true};
		System.out.println(Arrays.toString(data));
		for(Object e:data) {
			System.out.println(e);
		}
		System.out.println(data); // this gives the address
	}

}
