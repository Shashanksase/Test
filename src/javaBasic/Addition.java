package javaBasic;

public class Addition {

	int x = 10;
	int y = 20;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		sum();
		Addition obj = new Addition();
		obj.sum();
		int div = obj.sub(12, 6);
		System.out.println(div);
		obj.pwe();
		/*
		 * int p = obj.pwe(); System.out.println(p);
		 */
		obj.nam();
		String g = obj.nam();
		System.out.println(g);
	}

	public static void sum() {
		System.out.println("Sum method");
		int x = 14;
		int y = 12;
		System.out.println(x + y);
	}

	public int sub(int z, int q) {
		System.out.println("Sub method");
		int r = 20;
		int t = 12;
		System.out.println(r - t);
		int c = z / q;
		return c;
	}

	public int pwe() {
		System.out.println("pwe method");
		int e = 12;
		int t = 1;
		int y = e + t;
		System.out.println(y);
		return y;
	}

	public String nam() {
		System.out.println("nam method");
		String c = "QA";
		return c;
	}
}
