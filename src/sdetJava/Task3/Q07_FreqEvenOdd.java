package sdetJava.Task3;

import java.util.Scanner;

public class Q07_FreqEvenOdd {

	public static void main(String args[])
	{
	int row,col;
	int countEven = 0, countOdd = 0;
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
 
    //"Frequency of Even and Odd number"    
    for(int i=0; i< row; i++)
    {
    	for (int j= 0; j<col; j++)
    	{
    		if(a[i][j]%2==0)
    			countEven++;
    			else
    			countOdd++;
    	}
     }
    
    System.out.println("Frequency of Even number: " +countEven);
    System.out.println("Frequency of Odd number: " +countOdd);

}


}
