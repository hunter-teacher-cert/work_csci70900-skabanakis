//ds/sort1/SortDemoDriver.java
//Collaborators: mlaks23	twong-cs	Skabanakis

import java.io.*;
import java.util.*;

public class SortDemoDriver {
  public static void main(String[] args) {
//default constructor limited to 15
	SortDemo sd = new SortDemo();
	System.out.println(sd);
//constructor with the int
	SortDemo sd2 = new SortDemo(30);
	System.out.println(sd2);

	/* part 2 test lines */
	
	  int i;
	i = sd.findSmallestIndex(6);
  System.out.println(i);
	//System.out.println("sd["+"] = "+sd.get(i)+" : " + sd);
	i = sd2.findSmallestIndex(4);
   System.out.println(i);
	//System.out.println("sd2["+"] = "+sd2.get(i)+" : " + sd2);
	

	/* part 3 test lines */
	/*
	  System.out.println(sd);
	  sd.sort();
	  System.out.println(sd);
	*/
    }
}
