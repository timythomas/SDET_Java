package sdetJava.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_ZerosInArray {
	
	public static void main(String args[])
	{
		int arr_len;  
		System.out.println("Enter the array length: ");
	    Scanner sc = new Scanner(System.in);
	    arr_len = sc.nextInt();
	    
	    int[] arr = new int[arr_len];
	    
	    System.out.println("Enter the array elements:  ");
	    for(int i=0; i<arr_len; i++)
	    {
	         arr[i] = sc.nextInt();
	     }
	    
	     
	     System.out.println("Zero and Non-Zero elements in array: ");
	     int j = 0;
	     
	     for(int i=0; i<arr.length; i++)
	     {
	        if(arr[i]!=0)
	        {
	           arr[j]=arr[i];
	           j++;
	         }
	      }
	      while(j<arr.length) 
	      {
	         arr[j] = 0;
	         j++;
	      }
	      System.out.println(" "+Arrays.toString(arr));
	   }

}
