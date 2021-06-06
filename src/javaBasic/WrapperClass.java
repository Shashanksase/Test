	package javaBasic;

public class WrapperClass {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20);
		
       //data Conversation String to integer.			
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		
		int q=132;
		System.out.println(q);
		
		// 
		String w=String.valueOf(q);
		System.out.println(w+20);
		
	}

}
