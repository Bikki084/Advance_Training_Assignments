package com.problem_2.problem_statement_2_1;

import java.util.Scanner;

class String_Pallindrome {
	public static void main(String args[]) {
		String str, rev = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		str = sc.nextLine();

		int len = str.length();
		System.out.println("The length of the String is: " + len);
		System.out.println("Converted into Uppercase: " + str.toUpperCase());
		System.out.println("Converted into Lowercase: " + str.toLowerCase());

		for (int i = len - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");

	}
}