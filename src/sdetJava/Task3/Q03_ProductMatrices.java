package sdetJava.Task3;

import java.util.Scanner;

public class Q03_ProductMatrices {
	public static void main(String args[])
	{
		int len;
        System.out.print("Enter Matrix Dimension: ");
        Scanner s = new Scanner(System.in);
        len = s.nextInt();
        
    
        int[][] a = new int[len][len];
        int[][] b = new int[len][len];
        int[][] c = new int[len][len];
        
        System.out.println("Enter Matrix A: ");
        for(int i=0; i< len; i++)
        {
           for (int j= 0; j<len; j++)
           {
             a[i][j] = s.nextInt();
           }
        }
     
        System.out.println("Enter Matrix B: ");      
        for(int i=0; i< len; i++)
        {
        	for (int j= 0; j<len; j++)
        	{
        		b[i][j] = s.nextInt();
        	}
        }

       System.out.println("Product of two matrix: ");
        for(int i=0; i< len; i++)
        {
        	for (int j= 0; j<len; j++)
        	{
        		c[i][j] = 0;
        		
        		for(int k=0; k<len; k++)
        		{
        			c[i][j] = a[i][k] * b[k][j] + c[i][j];
        		}
        	}
        	
        }
        
        for(int i=0; i<len; i++)
        {
        	for(int j=0; j<len; j++)
        	{
        		System.out.print(" " +c[i][j]);
            }
        	System.out.println();
        }

	}

}
