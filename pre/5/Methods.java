import java.io.*;
import java.util.*;
public class Methods {
	public static void main(String[] args) {
		
		boolean b = isDivisible (4,2);
		System.out.println( b );
		boolean q = isTriangle (14,6,7);
		System.out.println (q);
		int w = ack (1,2);
		System.out.println (w);
	}
	public static boolean isDivisible (int n, int m){
		if (n % m == 0) {
		   return true;
		} else	{
			return false;
		}	
	}
	public static boolean isTriangle (int a, int c, int b) {
	
		int abTotal= (a+b);
		int acTotal= (a+c);
		int cbTotal = (c+b);
		if ( a > cbTotal || c > abTotal || b > acTotal) {
			return false;
		}
		else {
			return true;
		}
		
	}	
	
	public static int ack (int t, int s) {
		if (t==0) {
			return s+1;
		}	
		if (t>0 && s==0){
			return ack(t-1,1);
		}
		if (t>0 && s>0) {
			return ack(t-1,ack(t,s-1));
	}	
	return -1;
	}	
}