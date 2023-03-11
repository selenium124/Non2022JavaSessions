
package SeleniumSessions;

public class DoWhileConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1;
		do {
			System.out.println(p);
			if(p%5==0) {
				System.out.println("hi");
			}
			p++;
		}
		while(p<=50);
		
		//use cases:
		//launch a page: element: 0,5,10,20 ... n
		//
//		do {
//			element is present: yes
//			click on the element
//		}
//		while(cond);
		do {
			System.out.println("hello");
		}
		while(false);

	}

}
