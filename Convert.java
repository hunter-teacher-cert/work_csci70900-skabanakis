import java.io.*;
import java.util.Scanner;

public class Convert{
	public static void main(String[] args) {
		double celsius;
		double fahr;
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Type in Celsius");
		celsius = keyboard.nextDouble();
		fahr = (celsius * 1.8 + 35);
		System.out.println ("You said: " + celsius);
		System.out.print("The conversion to Fehenheit is:");
		System.out.println (fahr);
	}	
}
