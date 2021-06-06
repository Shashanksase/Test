package oopsconcept2;

public class TestCar {
	

	public static void main(String[] args) {
//static polymorphism ---Compile time polymorshism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.autostart();
		System.out.println(b.brand);
	
		
			
		Car e =new BMW();//Reference of parent to child 
		e.start();//Method of child is called 
		//Car.charging();
		Car.charging();
		
		BMW.charging();
		//BMW.charging();
		System.out.println(BMW.x+" BMW class");
		System.out.println(Car.x+" Car class");
		b.start(12);
		Car c= new Car();
		c.start();
		
	}

}
