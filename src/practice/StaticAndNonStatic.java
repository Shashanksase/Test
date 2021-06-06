package practice;

public class StaticAndNonStatic {
	int a;
	static int b = 1230;

	public static void sample() {
		System.out.println("Static method");
	}

	void sam() {
	}
	
	public void finalize() {
		System.out.println("Finalized method");
	}

	public static void main(String[] args) {

		StaticAndNonStatic s1 = new StaticAndNonStatic();
		s1.sam();
		sample();
		System.out.println("" + StaticAndNonStatic.b);
		
		s1= null;

		System.gc();
	}

}

