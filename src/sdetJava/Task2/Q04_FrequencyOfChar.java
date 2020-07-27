package sdetJava.Task2;

import java.util.Scanner;

public class Q04_FrequencyOfChar {

	public static void main(String args[])
	{
		String str;  
		int str_len;
		
		System.out.println("Enter the String: ");
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		str_len = str.length();
		
        int[] freq = new int[str_len];  
        
        char string[] = str.toCharArray();  
          
        for(int i = 0; i <str_len; i++) 
        {  
            freq[i] = 1;  
            for(int j = i+1; j <str_len; j++) 
            {  
                if(string[i] == string[j]) 
                {  
                    freq[i]++;  
                    string[j] = '0';  
                }  
            }  
        }  
          
        System.out.println("Frequency of a Character in a string: ");  
        for(int i = 0; i <freq.length; i++) 
        {  
            if(string[i] != ' ' && string[i] != '0')  
            {
                System.out.println(string[i] + "-" + freq[i]);  
            }
        }  
    }  
}

