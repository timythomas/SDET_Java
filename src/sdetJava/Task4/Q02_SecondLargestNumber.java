package sdetJava.Task4;

import java.util.Scanner;

public class Q02_SecondLargestNumber {

	public static void main(String[] args) {
		 
		int arr_len;
		System.out.println("Enter the array length: ");
		Scanner s = new Scanner(System.in);
		arr_len = s.nextInt();
		
		int[] arr = new int[arr_len];
		System.out.print("Enter the array elements: ");
		for (int i=0; i <arr_len; i++)
		{
			arr[i]=s.nextInt();
		}
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for (int i = 0; i < arr.length; i++) 
		{
 
			if (arr[i] > largest) 
			{
				secondLargest = largest;
				largest = arr[i];
 
			} 
			else if (arr[i] > secondLargest) 
			{
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("Second largest number is:" + secondLargest);
 
	}
}
