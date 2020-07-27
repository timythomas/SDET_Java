package sdetJava.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Concatenate2Array {
	
	public static void main(String args[])
	{
		int element_len;
		System.out.print("Enter the array element length: ");
		Scanner s = new Scanner(System.in);
		element_len = s.nextInt();
		
		int[] arr1 = new int[element_len];
		int[] arr2 = new int[element_len];
		
		System.out.println("Enter the Array1 elements: ");
		for (int i =0; i<element_len; i++) 
		{
			arr1[i] = s.nextInt();
		}
		
		System.out.println("Enter the Array2 elements: ");
		for (int i =0; i<element_len; i++) 
		{
			arr2[i] = s.nextInt();
		}
		
		int[] concat_arr = new int[arr1.length + arr2.length];
		int element = 0;
		
		for(int i: arr1)
		{
			concat_arr[element]=i;
			element++;
		}
		for(int i: arr2)
		{
			concat_arr[element]=i;
			element++;
		}
		
		System.out.println(Arrays.toString(concat_arr));
		}
}
		
