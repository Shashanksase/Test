package javaBasic;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading method = new MethodOverloading();

		method.sum(10.5);
		method.sum();
		method.sum(45);
		int n1 = 100, n2 = 20;
		// System.out.println(method.sum(n1, n2));
		int f = method.sum(n1, n2);
		System.out.println(f);
		// method.sum("Selenium");
		// sum("Selenium");
		method.sum();
		int p = method.name();
		System.out.println(p);
		System.out.println(method.name());

		int d=sert(4, 5);
		System.out.println(d);
		int h=method.sert(4, 5, 6);
		System.out.println(h);
	}
	public void sum(double d) {
		System.out.println("Sum method with 1 different input parameter");
		System.out.println(d);
	}

	public void sum(int i) {
		System.out.println("Sum method -- with 1 input paramter");
		 System.out.println(i);
	}

	public int sum(int r, int q) {
		System.out.println("Sum method with 2 input parameter");
		int d = r / q;
		return d;

	}
	public int sum(int q, int r,int y) {
		System.out.println("Sum method with 3 input parameter");
		int d = r / q;
		return d;

	}
	public String sum() {
		System.out.println("Sum method with no input parameter/different input parameter");
		String e = "Selenium";
		return e;
	}

	public int name() {
		int a = 10;
		int b = 14;
		int c = a + b;
		return c;
	}
	
	public static int sert(int a, int b) {
		a= a*2;
		b=b*3;
		int c=a+b;
		return c;
	}
	public  int sert(int a, int b,int c) {
		a= a*2;
		b=b*3;
		int c1=a+b+c;
		return c1;
	}
}
