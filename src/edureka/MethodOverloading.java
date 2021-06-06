package edureka;

public class MethodOverloading {
	int height;

	MethodOverloading() {
		System.out.println("bricks");
		height = 100;
	}

	MethodOverloading(int i) {
		System.out.println("Building new house " + i + " feet all");
		height = i;
		height=125;
	}

	void info() {
		System.out.println("house is "+height+" feet tall");
		
		String str="Stringg";
		System.out.println(str);
	}

	public static void main(String[] args) {

		new MethodOverloading(50);
		MethodOverloading t = new MethodOverloading();
		t.info();
		
		
	}

}
