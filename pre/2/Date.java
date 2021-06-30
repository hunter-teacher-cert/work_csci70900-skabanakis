import java.io.*;
import java.util.*;

public class Date{
	 public static void main(String[] args) {
		String day = "Friday";
		int date = 13;
		String month = "October";
		int year = 2001;
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year); 
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year); 
	 }
}