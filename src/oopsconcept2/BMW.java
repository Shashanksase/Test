package oopsconcept2;

public class BMW extends Car {
//Has-a -Relationship
	static int x=12;
	
	protected String brand = "Ford";
	@SuppressWarnings("unused")
	private String modelName = "Mustang";

	public void start() {// Overridden method from car class
		System.out.println("BMW-- Start ");
	}
//Own method of BMW
	public void autostart() {
		
		System.out.println("BMW-- Autostart engine");
	}
	//Own method of BMW
	public static void charging() {
		System.out.println("BMW class charging");
		
	}
	

}
