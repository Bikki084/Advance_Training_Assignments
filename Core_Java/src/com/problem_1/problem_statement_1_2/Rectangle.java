package com.problem_1.problem_statement_1_2;

public class Rectangle {
	private double length;
	private double breadth;

	public Rectangle() {
		length = 0;
		breadth = 0;
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double calculateArea() {
		return length * breadth;
	}

	public void display() {
		System.out.println("Length: " + length);
		System.out.println("Bredth: " + breadth);
		System.out.println("Area of Rectangle: " + calculateArea());
	}

}