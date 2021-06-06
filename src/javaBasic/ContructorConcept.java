package javaBasic;

public class ContructorConcept {
	int age;
	String name;

	public void sum() {

		System.out.println("Simple sum method (non static method)");
	}

	
	public ContructorConcept() {
		System.out.println("Zero input parameter");
	}

	public ContructorConcept(int age) {
		System.out.println("1 input parameter");
		this.age = age;// this.classvar = LocalVar
		System.out.println(age);
	}

	/*
	 * public ContructorConcept(int i, int name) {
	 * System.out.println("2 interger  parameter"); // System.out.println(i,s); }
	 */

	public ContructorConcept(int age, String name) {
		System.out.println("2 input parameter");
		this.age = age;
		this.name = name;
		//System.out.println(age + " " + name);

	}

	public static void main(String[] args) {
		new ContructorConcept();
		new ContructorConcept(10);
		ContructorConcept obj3 = new ContructorConcept(20, "Tom");
		// System.out.println(obj2.age);
		// System.out.println(obj2.name);
		System.out.println(obj3.age);
		System.out.println(obj3.name);
	}

}
