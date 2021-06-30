import java.io.*;
import java.util.*;
public class Loops {
	public static void main(String[] args) {
	 System.out.println("Power: ");
	 System.out.println(power(3,6));
	 System.out.println("Factorial: ");
	 System.out.println(factorial(7));
	 System.out.println("Expansion");
	 System.out.println(myexp(6,8));
	 
	}	
	public static double power(int x,int n) {
		double t=1;
		for(int i=0;i<n;i++){
			t=t*x;
		}	
		return t;
	}
	public static double factorial	(int x){
		double s = 1;
		for(int i=x;i>=1;i--) {
			s=s*i;
		}	
		return s;	
	}	
	public static double myexp (int x, int n){
		double e=0;
		for(int i = 0; i < n; i++) {
			e= e+(power(x,i)/factorial(i));
		}
		return e;
	}	
	
	public static double eexp (int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return 
		}
	}
	public static void check (int x) {
		return myexp, "\\t" eexp;
	}	
}		
	
