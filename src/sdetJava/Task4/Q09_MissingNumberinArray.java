package sdetJava.Task4;

import java.util.Scanner;

public class Q09_MissingNumberinArray {

    public static void main(String[] args)
    {
        int num, sum, m_num, m_element;
        
        System.out.println("Enter the array length: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        
        int[] arr = new int[num];
        System.out.println("Enter the array elements: ");
        for (int i=0; i < num-1; i++)
        {
        	arr[i]=s.nextInt();
        }
        
        sum = (num*(num+1))/2;
        
        m_num=0;
        for(int i=0;i<arr.length; i++)
        {
        	m_num=m_num+arr[i];
        }
        
        m_element = sum - m_num;
        System.out.println("Missing number: "+m_element);
    }
}