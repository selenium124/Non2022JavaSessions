package Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		int fib=8;
		System.out.print(i);
		for(int k=2; k<fib; k++) {
			int l=i+j;
			
			System.out.print(l);
			i=j;
			j=l;
			//System.out.print(k);
			
			
		}

	}

}
