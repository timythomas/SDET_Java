package sdetJava.Task1;

import java.util.Scanner;

public class Q04_Swapping2Variable {
	public static void main(String args[])
	{
		int test_cond;
		
		System.out.print("Enter the test condition number(Iteration): ");
		Scanner s = new Scanner(System.in);
		test_cond = s.nextInt();
		
			
		int[] a = new int[test_cond];
		int[] b = new int[test_cond];
		
		for (int i = 0; i <= test_cond - 1 ; i++)
		{
			
			System.out.print("Enter the value of a and b for test condition " + (i+1) + ": ");
			a[i] = s.nextInt();
			b[i] = s.nextInt();
		}
		
		System.out.println("After Swapping: ");
		
		for (int i = 0; i <= test_cond - 1; i++)
		{
			a[i] = a[i] + b[i];
			b[i] = a[i] - b[i];
			a[i] = a[i] - b[i];
			
			System.out.print(a[i]+" " +b[i]+ "\n");
			
		}
	}

}
