
public class L36 {
	int n = 500;

	void change_data(int n) {
		n = n + 40;
		System.out.println(n);
	}

	public static void main(String[] args) {
		L36 obj = new L36();
		System.out.println("Before calling n " + obj.n);
		obj.change_data(obj.n);
		System.out.println("After calling n " + obj.n);
	}

}
