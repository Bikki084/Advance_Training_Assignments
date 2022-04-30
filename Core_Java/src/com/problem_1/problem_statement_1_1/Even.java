package com.problem_1.problem_statement_1_1;

import java.util.*;

public class Even {

	public static void main(String[] args)

	{
		int n = 0, i = 0, cnt = 1;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a value greater than 2 : ");

			n = sc.nextInt();
		}

		System.out.println("Even numbers inside " + n);
		
		for (i = 1; i < n; i++)

		{
			if (i % 2 == 0) {
				System.out.println(cnt + ") " + i);
				cnt++;
			}
					
		}
		
		System.out.println();

	}

}