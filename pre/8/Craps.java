import java.io.*;
import java.util.*;

public class Craps {
	public static void main(String[] args) {
		System.out.print(round());
	}	
	public static int roll (int num){
		return (int) (Math.random() * (num - 1)) + 1;
	}

	public static int shoot (int dice, int max) {
		int total = 0;
		for (int i = 0; i < dice; i++) {
				total += roll(max);
		}
		return total;
	}
	public static boolean round () {
		int currshoot =shoot(2,6);
		if(currshoot ==7 || currshoot ==11){
			System.out.println ("\n Score =" + currshoot);
			System.out.println("You Win");
			return true;
		}
		else if(currshoot ==2 || currshoot ==3|| currshoot == 12){
			System.out.println ("\n Score =" + currshoot);
			System.out.println("You loose");
			return true;	
		}
		else{
			System.out.println ("\n Score =" + currshoot);
			System.out.println("You received points");
			return true;
		}	
		
	}	
}	
