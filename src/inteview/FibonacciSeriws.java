package inteview;

import java.util.Scanner;

public class FibonacciSeriws {

	public static void main(String[] args) {

		int n,a=0,b=0,c=1;
		@SuppressWarnings("resource")
		Scanner s =new  Scanner(System.in);
		System.out.println("Enter the value of n: " );
		n=s.nextInt();
		System.out.println("Fibonacci series: ");
		
		for (int i = 1; i <=n; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
	}

}
