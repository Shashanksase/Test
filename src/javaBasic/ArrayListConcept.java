package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> ar = new ArrayList<Comparable>();
		ar.add(5);
		ar.add("Tom");
		ar.add("Jerry");
		ar.add(2);
		ar.add(3);
		System.out.println(ar.size());
		ar.add(4);
		// ar.add(1, 9);
		ar.add("Jer");
		System.out.println(ar.size());
		System.out.println(ar.get(3) + " why");
		System.out.println(ar.set(3, "youtube"));
		System.out.println(ar.get(3));
		
		ArrayList<Integer>  numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numbers.removeIf(num -> num%2 ==1);
		System.out.println("Remove ODD_NUMBERS :: "+ numbers);
		 

		// System.out.println(ar.isEmpty());
		// ar.clear();

		System.out.println("^^^^^^^^^");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("********");
		System.out.println(ar.get(1));

		ArrayList<Integer> ar1 = new ArrayList<>();
		ar1.add(10);
		ar1.add(20);
		// ar1.add("Tom");
		System.out.println("ewrwerwerwer");

		ar.addAll(ar1);// Append all of the elements of argument collection to the list at the end
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
//			System.out.print(" ");

		}
		ar.remove(3);

		System.out.println(ar);

	}

	/*
	 * System.out.println(""); System.out.println("3333333");
	 * System.out.println(ar.contains(3)); System.out.println(ar.contains(39));
	 */
	/*
	 * System.out.println(ar1.size()); System.out.println(ar.toArray());
	 */

}
