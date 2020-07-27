package sdetJava.Task4;

import java.util.Scanner;

public class Q06_BinaryNumOrNot {
	
	public static void main(String args[])
	{
		int num,b_num, t_num;
		boolean binary = true;
		
		System.out.print("Enter the number: ");
		Scanner s = new Scanner(System.in);
		num =  s.nextInt();
		b_num = num;
		
		while(b_num!=0)
		{
			t_num = b_num%10;
			
			if(t_num>1)
			{
				binary = false;
				break;
			}
			else
			{
				b_num = b_num/10;
			}
			
		}
		if(binary)
			System.out.println("Entered number is Binary");
		else
			System.out.println("Entered number is not Binary");
	}

}
