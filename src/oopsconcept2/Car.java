package oopsconcept2;

public class Car {
	
	static int x=10;
	
	@SuppressWarnings("unused")
	private String modelName = "Mustang";

	public void start() {
		System.out.println("Car start");
	}

	public void stop() {
		System.out.println("Car-- Stop");
	}

	public void refuel() {
		System.out.println("Car Refuel");
	}
	
	public static void charging() {
		System.out.println("Car class charging");
		
	}
	public void start(int i) {
		System.out.println("Car start with one input parameter");
	}
	
	 double test(double a)
	    {
	        System.out.println("double a : " + a);
	        return a*a;
	    }
	 
	 int test () {
		 return 0;
	 }
	 int test(int w) {
		 return w;
	 }

	/*
	 * public static void main(String[] args) { charging(); Car nasdme = new Car();
	 * nasdme.refuel(); }
	 */
}
