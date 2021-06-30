import java.io.*;
import java.util.*;

public class Arrays { 
	public static void main(String[] args) {
	System.out.println( "Double array");
	double[] a = {2,7,9,4};
	int[] scores = {2,7,9,4};
	printArray(powArray (a,2));
	printArray (histogram(scores) );
	System.out.println (indexOfMax (scores));
	printArray(sieve(15));
	}
	public static double[] powArray (double[] a, int p){
		double[] b = new double[a.length];
		for(int i = 0; i < a.length; i++){
			b[i]= Math.pow(a[i],p);
		}
		return b;
	}	
	public static void	printArray (double[] a) {
		System.out.print("{" + a[0]);
		for (int i= 1; i<a.length; i++){
			System.out.print(","+ a[i]);
		}	
		System.out.println("}");
	}
	public static void	printArray (int[] a) {
		System.out.print("{" + a[0]);
		for (int i= 1; i<a.length; i++){
			System.out.print(","+ a[i]);
		}	
		System.out.println("}");
	}
	public static void	printArray (boolean[] a) {
		System.out.print("{" + a[0]);
		for (int i= 1; i<a.length; i++){
			System.out.print(","+ a[i]);
		}	
		System.out.println("}");
	}
	public static int[] histogram(int[] scores) {
		int [] counts =new int[100];
		for (int i=0; i<scores.length; i++){
			int hist = scores[i]/99;
			if(hist ==0) {
				counts[scores[i]]++;
			} else {
				counts[99] ++;
			}
		}
			return counts;
	}
	public static int indexOfMax (int[] f) {
	int a =f[0];
	int index=0;
		for(int i=0; i<f.length; i++) {
			if (a<f[i]){
				a= f[i];
				index=i;
			}
			
		}
			return index;
	}	
	public static boolean[] sieve (int n){
		boolean prime[] =new boolean [n+1];
		for (int i=0; i<n; i++) 
			prime[i]= true;
		
		for (int p =2; p*p <=n; p++){
			if(prime[p] ==true) {
				for(int i=p*p; i<=n;i += p)
					prime[i] = false;
			}
		}
		for (int i=2; i<=n; i++){
			if(prime[i] == true)
				System.out.print(i+" ");
		}	
		
		boolean _prime[] = new boolean[prime.length - 1];
		for (int i =0; i < _prime.length; i++) {
			_prime[i] = prime[i];
		}
		
		return _prime;
	}	
}