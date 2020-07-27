package sdetJava.Task2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q07_StringtoDate {

	public static void main(String args[]) throws Exception
	{
		String date1;
		Date conv_date;
		
		System.out.println("Enter the Date in dd/MM/yyyy format: ");
		Scanner s = new Scanner(System.in);
		date1=s.nextLine();
		
		System.out.println("Converted date format: ");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		conv_date =formatter.parse(date1);
		
		
		System.out.println(conv_date);
	}
}
