
public class CBV {

	public void m1(int x) {
		System.out.println("X in m1 before " + x);
		x = x + 10;
		System.out.println("X in m1 after " + x);
	}

	public void main() {
		int a = 10;
		System.out.println("a in main before" + a);
		m1(a);
		System.out.println("a in main after " + a);
	}
}
