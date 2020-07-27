package sdetJava.Task2;

import java.util.Scanner;

public class Q06_RemoveWhitespace {
	
	public static void main(String args[])
	{
		String str, r_str;
		
		System.out.println("Enter the String: ");
		Scanner s = new Scanner(System.in);
		str=s.nextLine();
		
		r_str = str.replaceAll("\\s", "");
		System.out.println("String after removing: \n\n" +r_str);
	}

}
