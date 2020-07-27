package sdetJava.Task1;

import java.util.Scanner;

public class Q01_ReverseString {
	
	 public static void main(String args[])
	    {
	        String str, revstr;
	        
	        System.out.println("Input a string: ");
	        Scanner s = new Scanner(System.in);
	        str = s.nextLine();
	        
	        revstr="";
	        int length = str.length();
	        
	        for (int i=length-1; i>=0; i--)
	        {
	            revstr = revstr + str.charAt(i);
	        }
	        System.out.println("Reverse Stirng: \n" +revstr);
	        
	    }


}
