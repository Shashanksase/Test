package javaBasic;

public class ContructorCar {
	String name;
	int price;
	String engine;
	String color;

	public ContructorCar(String name, int price, String engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
		System.out.println(name + " " + price + " " + engine);
	}

	public ContructorCar(String color) {
		this.color = color;
	}

	public ContructorCar(int i) {
		System.out.println("PARENET class with integer parameter " + i);
	}

	public ContructorCar() {
		System.out.println("Printed in super class");
	}

	/*
	 * public ContructorCar(String r) {
	 * System.out.println("Parent class with String parameter  "+r);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		ContructorCar obj1 = new ContructorCar("BMW", 4546546, "Automatic");
		System.out.println(obj1.name + " " + obj1.price + " " + obj1.engine);
		ContructorCar obj2 = new ContructorCar("Audi", 989898, "Automatic");
		System.out.println(obj2.name + " " + obj2.price + " " + obj2.engine);
		Dummy du = new Dummy("ASE", 789798, "manual");
		System.out.println(du.name + " " + du.price + " " + du.engine);
		Dummy du2 = new Dummy("pop", 789798, "maal");
		System.out.println(du2.name + " " + du2.price + " " + du2.engine);
		// ContructorCar obj5= new ContructorCar("dam");
		// obj5.du;
		// Dummy du3 = new Dummy();
		// du4 = new Dummy(45);
//Dummy du1 = new Dummy(10);
	}

}
