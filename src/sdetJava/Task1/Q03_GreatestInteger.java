package sdetJava.Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q03_GreatestInteger {

	public static void main(String args[])
	{
		int arr_len, test_cond, temp;
		
		System.out.print("Enter the array length:");
		Scanner s = new Scanner(System.in);
		arr_len = s.nextInt();
		
		System.out.print("Enter the number: ");
		test_cond = s.nextInt();
		
		System.out.println("Array Elements: ");
		int[] arr = new int[arr_len];
		int g_num = arr[0];
		
		for (int i = 0; i < arr_len; i++)
		{
			arr[i] = s.nextInt();
		}
		        
		for(int i=0; i<arr_len; i++)
		{
			for (int k=0; k<test_cond; k++) 
			{
				if(arr[i]>test_cond)
				{
					g_num = test_cond;
					test_cond = arr[i];
					
				}
				else if(arr[i]>g_num)
				{
					g_num=arr[i];
					
				}
				
			}						
}
		System.out.println("Second largest number: " +g_num);
			
		}
	}
