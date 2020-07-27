package sdetJava.Task2;

import java.util.Scanner;

public class Q01_Add2Matrix {
	public static void main (String args[])
	{
            int len1, len2;
            System.out.print("Enter Matrix Dimension: ");
            Scanner s = new Scanner(System.in);
            len1 = s.nextInt();
            len2 = s.nextInt();
        
            int[][] a = new int[len1][len2];
            int[][] b = new int[len1][len2];
            int[][] c = new int[len1][len2];

            System.out.println("Enter Matrix A: ");
            for(int i=0; i< len1; i++)
            {
               for (int j= 0; j<len2; j++)
               {
                 a[i][j] = s.nextInt();
               }
            }
         
            System.out.println("Enter Matrix B: ");      
            for(int i=0; i< len1; i++)
            {
            	for (int j= 0; j<len2; j++)
            	{
            		b[i][j] = s.nextInt();
            	}
            }

           System.out.println("Addition of two matrix: ");
            for(int i=0; i< len1; i++)
            {
            	for (int j= 0; j<len2; j++)
            	{
            		c[i][j] = a[i][j] + b [i][j];
            		System.out.print(" " +c[i][j]);
            	}
            	System.out.println();
            }
	}
}

