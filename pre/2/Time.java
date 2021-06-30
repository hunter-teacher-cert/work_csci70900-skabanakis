import java.io.*;
import java.util.*;

public class Time{
	public static void main(String[] args) {
		int hour= 8 ;
		int minute= 07;
		int second= 25;
		int sinceMidnight=((hour*60*60)+(minute*60)+(second));
		double totalSecond= 86400;
		double percent=(sinceMidnight/totalSecond);
		int newHour=9;
		int newMinute=22;
		int newSecond=50;
		int newSecondCalc=(newHour*60*60)+(newMinute*60)+(newSecond);
		System.out.print("Number of second since midnight: ");
	    System.out.println(sinceMidnight);
		System.out.print("Number of second remaining in the day: ");
	    System.out.println(totalSecond-sinceMidnight);
		System.out.print("Percentage of the Day that has passed ");
	    System.out.println(percent);
		System.out.print("Time Elapsed in seconds ");
	    System.out.println((newSecondCalc-sinceMidnight));
	}	
}