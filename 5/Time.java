import java.io.*;
import java.util.*;

public class Time {

  //Declare new variables
  private int hour;
  private int minute;
  private double second;

  //Constructor creates a new instance of the Time class
  //i.e. creates a new Time object
  public Time() {

    //Initialize the variables in the Time object
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }

  //Constructor creates a new instance of the Time class
  //i.e. creates a new Time object
  public Time(int a, int b, double c) {

    //Initialize the variables in the Time object with
    //the parameter values
    this.hour = a;
    this.minute = b;
    this.second = c;
  }

  //Create a method to print out the Time object
  public static void printTime(Time t) {
    System.out.print(t.hour);
    System.out.print(":");
    System.out.print(t.minute);
    System.out.print(":");
    System.out.println(t.second);
  }

  //Create a method to print out the Time object
  public String toString() {
    return String.format("%02d:%02d:%04.1f\n",
        this.hour, this.minute, this.second);
  }

   //Create a method to compare two times
  public boolean equals(Time that){
    return this.hour == that.hour //this.hour and that.hour are class variables
        && this.minute == that.minute
        && this.second == that.second;
  }

}//end class

// Your driver file should contain code to (in suggested development order)
  // instantiate a newly-created Time object (aka "instance of class Time") with default value(s)
  // instantiate a newly-created Time object with specified value(s)
  // assign a Time var the value null
  // assign a Time var the value of an existing Time var
  // print all of the above (See multiple ways to do this? Try all -- and document in comments!)
  // test for equality of each of the Time instances above. Print results.
  // add two Time objects and print results
  // add two Time objects and save the result in another Time object


// Your Time class definition file should contain code to
  // tell a Time object how to do the tasks necessary to achieve the above
