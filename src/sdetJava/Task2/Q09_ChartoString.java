package sdetJava.Task2;

import java.util.Scanner;

public class Q09_ChartoString {
	
	public static void main(String args[])
	{
		char ch, ch1;
		String str, str1;
		
		System.out.println("Character to String Conversion:");
		System.out.print("\nEnter a Character: ");
		Scanner s = new Scanner(System.in);
		ch=s.next().charAt(0);
		str = String.valueOf(ch);
		System.out.print("Char to String :" +str+"\n");
		
		System.out.println("\nString to Character conversion: ");
		System.out.print("\nEnter a String: ");
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		int strlen = str1.length();
		
		for (int i=0; i<strlen; i++)
		{
			ch1 = str1.charAt(i);
			System.out.println("Character at index " +i+ ": " +ch1);
		}
	}

}
