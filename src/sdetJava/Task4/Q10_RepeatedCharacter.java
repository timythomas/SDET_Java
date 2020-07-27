package sdetJava.Task4;

import java.util.Scanner;

public class Q10_RepeatedCharacter {
	static final int  max_char = 256;
	
	public static void main(String[] args)
	{
	String str;
	int[] count = new int[max_char];
	int length, find;
	
	System.out.println("Enter the String: ");
	Scanner s = new Scanner(System.in);
	str = s.nextLine();
	
	length = str.length();
	for (int i = 0; i < length; i++)
	{
		count[str.charAt(i)]++; 
	}
     
    char ch[] = new char[str.length()]; 
    for (int i = 0; i < length; i++) 
    { 
        ch[i] = str.charAt(i); 
        find = 0; 
        for (int j = 0; j <= i; j++) 
        { 
            if (str.charAt(i) == ch[j])
            {
                find++;     
            }
        } 

        if (count[str.charAt(i)] == 1) 
        {
            System.out.println(str.charAt(i) + " is first repeated character. Occurrence: "+ count[str.charAt(i)] );
            //);
        }
        else
        {
        	System.out.println(str.charAt(i) + " is non first repeated character. Occurrence: "+ count[str.charAt(i)] );
        }
    } 
} 
}

