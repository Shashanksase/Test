package javaBasic;

public class CallByValue {
	int p;
	int q;
	static int w = 10;

	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		int x = 4;
		int y = 5;
		int t = obj.TestSum(x, y);// Call by value or pass by value
		System.out.println(t);

		
		//Before swap
		obj.p = 50;
		obj.q = 60;
		System.out.println(obj.p);
		System.out.println(obj.q);

		obj.swap(obj);
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int TestSum(int a, int b) {
		a = 2;
		b = 8;
		int c = a + b;
		return c;
	}

	public void swap(CallByValue t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;

	}

}
