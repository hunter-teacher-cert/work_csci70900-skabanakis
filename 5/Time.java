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

  //create a static method to add two Time objects together
  public static Time add(Time t1, Time t2){
    Time sum = new Time();
    sum.hour = t1.hour + t2.hour;
    sum.minute = t1.minute + t2.minute;
    sum.second = t1.second + t2.second;
    return sum;
  }

  //create an instance method to add two Time objects together
  public Time add(Time t2) {
    Time sum = new Time();
    sum.hour = this.hour + t2.hour;
    sum.minute = this.minute + t2.minute;
    sum.second = this.second + t2.second;

/*
this is because we wanted to catch that if the minutes are greater than 60 then it will add an hour or if if the seconds are greater than 60 it will add a minutes
sum.second = sum.second % 60;
sum.minute = sum.minute+sum.second % 60;
sum.hour = sum.minute % 60;
sum.minute = sum.minute % 60;
*/

    return sum;


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
