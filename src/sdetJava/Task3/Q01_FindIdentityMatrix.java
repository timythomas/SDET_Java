package sdetJava.Task3;

import java.util.Scanner;

public class Q01_FindIdentityMatrix {
	
	public static void main(String args[])
	{
		int row, col;
		boolean flag = true;
		System.out.print("Enter the Matrix Dimension - Row and Column:  ");
		Scanner s = new Scanner(System.in);
		row=s.nextInt();
		col=s.nextInt();
		
		int[][] identity_matrix = new int[row][col];
		
		System.out.println("Enter the Matrix: ");
		
		for(int i=0; i<row; i++)
		{
			for(int j=0;j<col;j++)
			{
				identity_matrix[i][j]=s.nextInt();
			}
		}
		
		for(int i = 0; i < row; i++){  
            for(int j = 0; j < col; j++){  
              if(i == j && identity_matrix[i][j] != 1){  
                  flag = false;  
                  break;  
              }  
              if(i != j && identity_matrix[i][j] != 0){  
                  flag = false;  
                  break;  
              }  
            }  
        }  
          
        if(flag)  
        {
            System.out.println("Entered matrix is an identity matrix");  
        }
        else
        {
            System.out.println("Entered matrix is not an identity matrix");  
        }
	}

}
