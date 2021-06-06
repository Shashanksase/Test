package practice;

public class Sample8 {
	int b = 10;// Global non-static variable also called as "instance variable"
	static int a = 10; // Global variable

	public void as() {
		int a = 40;
		System.out.println("The valuie of local variable is: " + a);
	}
	
	static void ads(int a) {System.out.println("The valus of a is : "+a);}

	public static void main(String[] args) {

		System.out.println("The main method starts");
		System.out.println("The vale of a is :" + Sample8.a);
		Sample8.a = 20;
		System.out.println("the value of  new a is : " + Sample8.a);
		System.out.println("The main ends....");
		// System.out.println(a);
		Sample8 me = new Sample8();
		me.as();
		
		int r=50;
		Sample8.ads(r);

	}

}
