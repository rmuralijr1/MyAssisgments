package week1.day2;

public class FibbonnaciSeries {

	public static void main(String[] args) {
		int fib1=0,fib2=1, fib3;
		for (int i = 0; i < 8; i++) {
			System.out.println(fib1);

			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;

			
		}
		
		
	}

}
