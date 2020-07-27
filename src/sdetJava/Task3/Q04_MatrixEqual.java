package sdetJava.Task3;

import java.util.Scanner;

public class Q04_MatrixEqual {

	public static void main(String args[])
	{
	int row,col;
	boolean flag = true;
	
    System.out.print("Enter Matrix Dimension: ");
    Scanner s = new Scanner(System.in);
    row = s.nextInt();
    col = s.nextInt();
    

    int[][] a = new int[row][col];
    int[][] b = new int[row][col];
    
    System.out.println("Enter Matrix A: ");
    for(int i=0; i< row; i++)
    {
       for (int j= 0; j<col; j++)
       {
         a[i][j] = s.nextInt();
       }
    }
 
    System.out.println("Enter Matrix B: ");      
    for(int i=0; i< row; i++)
    {
    	for (int j= 0; j<col; j++)
    	{
    		b[i][j] = s.nextInt();
    	}
    }

   //Check whether both matrix are equal
    
    for(int i=0; i< row; i++)
    {
    	for (int j= 0; j<col; j++)
    	{
    		if(a[i][j] != b[i][j])   
    			flag = false;
       	}
    	
    }
    
    if (flag)
    {
    	System.out.println("Both the matrix are EQUAL");
	}
    else
    {
    	System.out.println("Both the matrix are NOT EQUAL");
    }


	}
}
