package inteview;

//public class MyException {
/*
 * @SuppressWarnings("serial") class MyException extends Exception
 * 
 * {
 * 
 * String s1;
 * 
 * MyException(String s2)
 * 
 * { s1 = s2; }
 * 
 * @Override
 * 
 * public String toString()
 * 
 * {
 * 
 * return ("Output String = " +s1);
 * 
 * }
 * 
 * }
 * 
 * public class NewClass
 * 
 * {
 * 
 * public void main(String args[])
 * 
 * {
 * 
 * try
 * 
 * {
 * 
 * throw new MyException(“Custom message”);
 * 
 * }
 * 
 * catch(MyException exp)
 * 
 * {
 * 
 * System.out.println(exp);
 * 
 * }
 * 
 * }
 * 
 * }
 */

public class MyException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;

	/*
	 * Constructor of custom exception class here I am copying the message that we
	 * are passing while throwing the exception to a string and then displaying that
	 * string along with the message.
	 */
	MyException(String str2) {
		this.str1 = str2;

	}

	public String toString() {
		return ("MyException Occurred: " + str1);
	}
}
