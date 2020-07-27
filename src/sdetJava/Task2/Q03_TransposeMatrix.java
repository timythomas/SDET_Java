package sdetJava.Task2;

import java.util.Scanner;

public class Q03_TransposeMatrix {
	public static void main (String args[])
	{
            int len;
            System.out.print("Enter Matrix Dimension: ");
            Scanner s = new Scanner(System.in);
            len = s.nextInt();
            
        
            int[][] a = new int[len][len];
            int[][] b = new int[len][len];
            
            
            System.out.println("Enter Matrix: ");
            for(int i=0; i< len; i++)
            {
               for (int j= 0; j<len; j++)
               {
                 a[i][j] = s.nextInt();
               }
            }
         
            System.out.println("Transpose of a Matrix is : ");      
            for(int i=0; i< len; i++)
            {
            	for (int j= 0; j<len; j++)
            	{
            		b[i][j] = a[j][i];
            		System.out.print(b[i][j]+ " ");
            	}
            	System.out.println();
            }
	}
}
