package sdetJava.Task3;

import java.util.Scanner;

public class Q06_UpperTriangularMatrix {

	public static void main(String args[])
	{
	int row,col;
		
    System.out.print("Enter Matrix Dimension: ");
    Scanner s = new Scanner(System.in);
    row = s.nextInt();
    col = s.nextInt();
    

    int[][] a = new int[row][col];
        
    System.out.println("Enter Matrix A: ");
    for(int i=0; i< row; i++)
    {
       for (int j= 0; j<col; j++)
       {
         a[i][j] = s.nextInt();
       }
    }
 
    System.out.println("Upper Triangular Matrix: ");      
    for(int i=0; i< row; i++)
    {
    	for (int j= 0; j<col; j++)
    	{
    		if(i>j)
    			System.out.print("0" + " ");
    		else
    			System.out.print(a[i][j] + " ");
    	}
    	System.out.println();
    }

}
}
