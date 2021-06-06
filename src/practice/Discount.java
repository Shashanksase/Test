	package practice;

import java.util.Scanner;

public class Discount {
	public static void main(String args[])
	{
		int amt,discount;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\tEnter amount : ");
		amt = Integer.parseInt(sc.nextLine());

		if(amt>20000)
			discount=15;

		else if(amt>15000)
			discount=10;

		else if(amt>10000)
			discount=5;

		else
			discount=0;

		System.out.print("\n\tYou will get " + discount + "% discount.");
	}
}
	
