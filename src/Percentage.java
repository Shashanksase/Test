import java.util.Scanner;

public class Percentage {
	private static Scanner sc;

	public static void main(String[] args) {
		int english, chemistry, computers, physics, maths;
		sc = new Scanner(System.in);

		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();
		chemistry = sc.nextInt();
		computers = sc.nextInt();
		physics = sc.nextInt();
		maths = sc.nextInt();

		totalmarks(english, chemistry, computers, physics, maths);
	}

	public static void totalmarks(int eng, int chem, int com, int phy, int math) {
		float total, Percentage, Average;
		total = eng + chem + com + phy + math;
		Average = total / 5;
		Percentage = (total / 500) * 100;

		System.out.println(" Total Marks =  " + total);
		System.out.println(" Average Marks =  " + Average);
		System.out.println(" Marks Percentage =  " + Percentage);
	}
}
