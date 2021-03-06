package com.problem_1.problem_statement_1_2;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		System.out.println("with default values");
		Rectangle r1 = new Rectangle();
		System.out.println("Lentgh: " + r1.getLength() + ", Breadth: " + r1.getBreadth());
		System.out.println("Display Method");
		r1.display();
		
	

		System.out.println("\nWith user input");
		Rectangle r2 = new Rectangle();
		System.out.println("Enter Length: ");
		r2.setLength(new Scanner(System.in).nextDouble());
		System.out.println("Enter Breadth: ");
		r2.setBreadth(new Scanner(System.in).nextDouble());
		System.out.println("Display Method");
		r2.display();
		
		
		System.out.println("\nPassing Values By Parameterized Constructor, length = 6, breadth = 8");
		Rectangle r3 = new Rectangle(6, 8);
		System.out.println("Length: "+r3.getLength()+", Breadth: "+r3.getBreadth());
		System.out.println("Display Method");
		r3.display();
		
		System.out.println("\nWith user input");
		Rectangle r4 = new Rectangle();
		System.out.println("Enter Length: ");
		r4.setLength(new Scanner(System.in).nextDouble());
		System.out.println("Enter Breadth: ");
		r4.setBreadth(new Scanner(System.in).nextDouble());
		System.out.println("Display Method");
		r4.display();
		
		System.out.println("\nWith user input");
		Rectangle r5 = new Rectangle();
		System.out.println("Enter Length: ");
		r5.setLength(new Scanner(System.in).nextDouble());
		System.out.println("Enter Breadth: ");
		r5.setBreadth(new Scanner(System.in).nextDouble());
		System.out.println("Display Method");
		r5.display();
		
	}



}
