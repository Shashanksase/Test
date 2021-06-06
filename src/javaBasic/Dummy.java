package javaBasic;

public class Dummy extends ContructorCar {

	public Dummy(String name, int price, String engine) {
		super(name, price, engine);
		System.out.println("Child class ");
		
	}

	public Dummy(int i) {
		super(78);
	}
	
	
public Dummy(String color) {
	this.color=color;
	
}
	
/*
 * public Dummy() { super("JAM"); }
 */
}
