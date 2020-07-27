package sdetJava.Task2;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Q05_TimeDifference {

	public static void main(String args[]) 
	{
		String dateStart, dateStop;
		System.out.println("Enter Start date and time: ");
		Scanner s = new Scanner(System.in);
		dateStart = s.nextLine();
		System.out.println("Enter Stop date and time: ");
		dateStop = s.nextLine();

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		Date d1 = null;
		Date d2 = null;

		try 
		{
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			
			long diff = d2.getTime() - d1.getTime(); //Difference calculated in Milli-seconds
			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
