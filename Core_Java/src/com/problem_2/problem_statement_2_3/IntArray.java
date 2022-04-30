package com.problem_2.problem_statement_2_3;

import java.util.Arrays;

public class IntArray {
	public static void main(String[] args) {
		// Initialize array
		int arr[] = { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0 };
		int sum = 0; // initialize sum
        int j;
  
       

		int n = arr.length;
		int newArr[] = new int[n+1];
		System.out.println("The original array is: "+Arrays.toString(arr));
		for (int i = 0; i < n; i++) {
			newArr[i] = arr[i];
		}
		
		 // Iterate through all elements and add them to sum
        for (j = 0; j < arr.length; j++)
            sum += arr[j];
        
        System.out.println("The sum of original array is: "+sum);

		newArr[n] = sum;
		System.out.println("After adding sum in original array: "+Arrays.toString(newArr));
		
		
		double average = sum / newArr.length;	
		System.out.println("The average of updated array is: "+average);
		
		int len = newArr.length;
		int newArr1[] = new int[len+1];
		
		
		for (int i = 0; i < len; i++) {
			newArr1[i] = newArr[i];
		}
		newArr1[n] = (int) average;
		System.out.println("After adding sum in original array: "+Arrays.toString(newArr1));
	}

}
