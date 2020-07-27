package sdetJava.Task3;

import java.util.Scanner;

public class Q02_SumRowCol {
	
	public static void main(String args[])
	{
		int row,col, sumRow, sumCol;
        System.out.print("Enter Matrix Dimension: ");
        Scanner s = new Scanner(System.in);
        row = s.nextInt();
        col = s.nextInt();
        
    
        int[][] a = new int[row][col];
               
        
        System.out.println("Enter Matrix: ");
        for(int i=0; i< row; i++)
        {
           for (int j= 0; j<col; j++)
           {
             a[i][j] = s.nextInt();
           }
        }
     
        System.out.println("Sum of Row and Column  Matrix: ");      
        for(int i=0; i< row; i++)
        {
        	sumRow=0;
        	for (int j= 0; j<col; j++)
        	{
        		sumRow = sumRow + a[i][j];        		
        	}
        	System.out.println("Sum of Row" +(i+1)+ " : " +sumRow);
        }
        
        for(int i=0; i< row; i++)
        {
        	sumCol=0;
        	for (int j= 0; j<col; j++)
        	{
        		sumCol = sumCol + a[j][i];        		
        	}
        	System.out.println("Sum of Column" +(i+1)+ " : " +sumCol);
        }

	}

}
