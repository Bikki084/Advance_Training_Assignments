package com.problem_5.problem_statement_5_1;

public class StringDemo {

	public static void main(String[] args) {
		String txt = "JAVA is Simple";

		System.out.println(txt.toUpperCase()); // UpperCase

		System.out.println(txt.toLowerCase()); // LowerCase

		String[] words = txt.split("\\s"); // 1st words of letter
		for (String w : words) {
			System.out.print(w.charAt(0));
			System.out.print("");
		}
		System.out.println(" ");

		String[] words1 = txt.split("\\s"); // Change order
		for (String w : words1) {
			System.out.println(w);
		}

		// String Builder reverse
		
		 String words3434[] = txt.split("\\s");
		 String reverseWord="";  
		 for(String w:words3434){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    System.out.println( reverseWord.trim()); 
		
		
		
		// Total Length
		System.out.println("length of string " + txt.length());
	}
}
