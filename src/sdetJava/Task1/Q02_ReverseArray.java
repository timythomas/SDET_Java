package sdetJava.Task1;

import java.util.Scanner;

public class Q02_ReverseArray {
    public static void main(String[] args) 
    {
        int number, i = 0;
        System.out.print("Enter the number of elements in array: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        int[] element = new int[number];
        for (i = 0; i < number; i++)
        {
            System.out.println("Enter the element" + i + " : ");
            element[i] = s.nextInt();
        }
        System.out.println("Reverse Array:");
        for (i = element.length - 1; i >= 0; i--)
        {
            System.out.println(element[i]);
        }
    }
}