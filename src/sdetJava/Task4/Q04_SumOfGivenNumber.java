package sdetJava.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_SumOfGivenNumber {
	
	public static void main(String args[])
	{
		int array_len, number;
		System.out.print("Enter the array length: ");
		Scanner s = new Scanner(System.in);
		array_len = s.nextInt();
		
		int[] arr = new int[array_len];
		System.out.println("Enter the array elements: ");
		for (int i =0; i<array_len; i++)
		{
			arr[i] = s.nextInt();
		}
		
		System.out.print("Enter a number (To find the pair of all elements eqaul to sum of a number) : ");
		number = s.nextInt();
		
		Arrays.sort(arr);
		
		System.out.println("Pairs of elements whose sum is "+number+ " : ");
		int i =0;
		int j = arr.length-1;
		while(i<j)
		{
			if(arr[i] + arr[j] == number)
			{
				System.out.println(arr[i]+ " + " +arr[j]+ " = " +number);
				i++;
				j--;
			}
			else if(arr[i]+arr[j]<number)
			{
				i++;
				
			}
			else if(arr[i]+arr[j]>number)
			{
				j--;
				
			}
		}
	}
}