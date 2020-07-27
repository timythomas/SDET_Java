package sdetJava.Task1;

import java.util.Scanner;

public class Q05_Powerof2 {
	public static void main(String args[])
	{
		
		int test_cond;
		boolean power_num;
		
		System.out.print("Enter test condition - Iteration: ");
		Scanner s = new Scanner(System.in);
		test_cond=s.nextInt();
		
		int[] number = new int[test_cond];
		
		if (test_cond >=1 && test_cond <= 100)
		{
			System.out.println("Enter the positive integer number between 0 - 1018: ");
			
			for (int i=0; i<test_cond; i++)
			{
				number[i] = s.nextInt();
			
			}
		}
		else
		{
			System.out.println("Enter valid number");
		}
			for (int i=0; i<test_cond; i++)
			{
				
				power_num = number[i] != 0 && ((number[i] & (number[i] - 1)) == 0);
				
				if(power_num)
				{
					System.out.println(number[i]+" : YES");
				}
				else
				{
					System.out.println(number[i]+" : NO");
				}
			 }
		}
		
	}

