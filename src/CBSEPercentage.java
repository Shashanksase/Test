import java.util.Scanner;

public class CBSEPercentage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter you physic marks: ");
		int physics = scan.nextInt();
		int phy = physics;
		if (phy<100) {
			System.out.println("The value enter is below 100  ");
		} else {
			System.out.println("The value enter is above 100 ");

		}
		System.out.print("Enter your Chemistry marks:");
		int chemistry = scan.nextInt();
		System.out.print("Enter your Maths marks: ");
		int Maths = scan.nextInt();
		System.out.print("Enter your English marks: ");
		int English = scan.nextInt();
		System.out.print("Enter your Hindi marks: ");
		int Hindi = scan.nextInt();

		float percentage = ((physics + chemistry + Maths + English + Hindi) / 500.0f) * 100;

		System.out.print("Total Percentage is : ");
		System.out.print(percentage);
		scan.close();

	}

}
