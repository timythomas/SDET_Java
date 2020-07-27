package sdetJava.Task4;

import java.util.Scanner;

public class Q07_StringRotation {
	
   public static void main(String args[])
	{
		String str1, str2, str3;
			
		System.out.println("Enter the String: ");
		Scanner s = new Scanner(System.in);
		str1=s.nextLine();
		
		System.out.println("Enter the Rotated string: ");
		str2 = s.nextLine();
		
		 if (str1.length() != str2.length()) 
	     {  
	        System.out.println("String2 is not rotated version of String1");  
	     }  
		 else
		 {		
		 	str3=str1+str1;
	        if (str3.contains(str2)) 
	        {
	        	System.out.println("String2 is rotated version of String1");
	            
	        }
	        else
	        {
	        	System.out.println("String2 is not rotated version of String1");
	        }
		 }
    }  
		
}

