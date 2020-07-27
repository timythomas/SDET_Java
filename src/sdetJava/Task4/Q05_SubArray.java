package sdetJava.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_SubArray {
	
	public static void main(String args[])
	{
		int arr_len, number, sum, start;
		
		System.out.println("Enter the array length: ");
		Scanner s = new Scanner(System.in);
		arr_len = s.nextInt();
		
		int[] arr = new int[arr_len];
		
		System.out.println("Enter the Array elements: ");
		for (int i =0; i<arr_len; i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the number to find the sum: ");
		number=s.nextInt();
		
		sum = arr[0];
	    start = 0;
	 
	    for (int i = 1; i < arr.length; i++)
	    {
	        sum = sum + arr[i];
	        while(sum > number && start <= i-1)
	        {
	             sum = sum - arr[start];
	             start++;
	        }
	        if(sum == number)
	        {
	           System.out.println("Sub array whose sum is "+number+" is ");
	 
	            for (int j = start; j <= i; j++)
	            {
	                System.out.print(arr[j]+" ");
	            }
	 
	            System.out.println();
	        }
	        }
	    }
	}
