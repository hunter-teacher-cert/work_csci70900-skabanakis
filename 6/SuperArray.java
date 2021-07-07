/**
Michelle Best, Dwayne Levene, Stephannia Kabanakis
   lab skeleton
   encapsulation / SuperArray
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
 **/

import java.io.*;
import java.util.*;

public class SuperArray
{


  //instance vars
  private int[] data;           //where the actual data is stored
  
  private int numberElements;   //number of "meaningful" elements
  
  //default constructor -- initializes capacity to 10
  //you do not need to reclassifly the array type after declaring it on line 22 . Only declare once
  public SuperArray()
  {
    this.numberElements = 0;
    this.data = new int[10] ;
   
  }

  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    this.numberElements = 0; 
    this.data = new int [size];
  
  }




  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  //start here 1st
  public void add( int value )
  {
    
    this.data[numberElements] = value;
    numberElements++;  
  } //end add()
   

  
  
    //this.name;
  
    //this.data
    // test to see if we need to grow, then grow
    // SIMPLE VERSION DOES NOT AUTO-GROW CAPACITY; INSERT MORE CODE HERE LATER

    // add item


    // increment numberElements


  


  public boolean isEmpty()
  {
    if (1>numberElements){
      System.out.println(numberElements);
  
      return true;
    
    }
    else{
       System.out.println(numberElements);
      return false;
    }
  }
/*
//3rd task to complete
  public int get(int index)
  {

  }

//2nd complete this method
  public String toString()
  {
    System.out.println();
  }//end toString()


  //helper method for debugging/development phase
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?

    // copy over all the elements from the old array to the new one

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?

  }//end grow()
*/
}//end class