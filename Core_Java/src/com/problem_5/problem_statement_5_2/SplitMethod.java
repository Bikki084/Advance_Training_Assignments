package com.problem_5.problem_statement_5_2;

import java.util.Scanner;

public class SplitMethod {
	public static void main(String[] args) {
		System.out.println("Enter the expression: ");
		String s1 = new Scanner(System.in).nextLine();
//        "23  +      45   -      (   343   /   12  )";
		String s[] = s1.split(" ");
		String s2 = "", s3 = "";
		for (String str : s)
			if (!str.equals(" "))
				s2 += str;

		for (int i = 0; i < s2.length(); i++)
			if (48 <= (int) s2.charAt(i) && 57 >= (int) s2.charAt(i))
				s3 += s2.charAt(i);
			else
				s3 += "\n" + s2.charAt(i) + "\n";
		s = s3.split("\n");
		s3 = "";
		for (String str : s)
			if (str.isBlank())
				s3 += "";
			else
				s3 += str + "\n";
		s3 = s3.substring(0, s3.length() - 1);
		System.out.println(s3);
	}
}