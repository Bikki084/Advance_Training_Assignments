package com.problem_16.problem_statement_16;


import java.util.Scanner;

public class Stairs_Demo
{

	static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
  
    static int countWays(int s)
    {
        return fib(s + 1);
    }
 
       public static void main(String args[]) {
    
    	Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the Number: ");
       int n=scanner.nextInt();
    
    {
        
        System.out.println("Number of ways => " + countWays(n));
    }
  }
 }
