// if the user chooses a circle with number of stones = to number of spaces left they gain extra turn
//6,5,4,3,2,1 
//If(firstCircle == 6) pick that circle
//else if (circle[2] == 5) pick that circle
//else if (circle[3] == 6) pick that circles
// depending on my amount in the circle that is my number of steps
//int[] counts = new int[4];
/*What we still need:
-Extra turn if ends with Mancala
-AI development
-Avoiding array out of bounds errors
*/
import java.io.*;
import java.util.*;
public class Mancala2 {
/*This function displays it conceptually as a Mancala board should appear rather than how it is represented by the computer in memory.*/
    public static void drawBoardForUser(int[] gameBoard){
System.out.print("    ");
System.out.println("AI");
System.out.print("    ");System.out.print("#13 ");
System.out.print("#12 ");
System.out.print("#11 ");
System.out.print("#10 ");
System.out.print("#9 ");
System.out.print("#8 ");
System.out.print("\n");
System.out.print("    ");
System.out.print("["+gameBoard[13]+"] ");
System.out.print("["+gameBoard[12]+"] ");
System.out.print("["+gameBoard[11]+"] ");
System.out.print("["+gameBoard[10]+"] ");
System.out.print("["+gameBoard[9]+"] ");
System.out.print("["+gameBoard[8]+"] ");
//right m
System.out.print("\n");
System.out.print("#0 ");
System.out.print("                          ");
System.out.println("#7 ");
System.out.print("<"+gameBoard[0]+">"); 
System.out.print("                          ");
System.out.print("<"+gameBoard[7]+">");
System.out.print("\n");
System.out.print("    ");
System.out.println("User");
System.out.print("    ");
System.out.print("#1  ");
System.out.print("#2  ");
System.out.print("#3  ");
System.out.print("#4  ");
System.out.print("#5  ");
System.out.print("#6  ");
System.out.print("\n");
System.out.print("    ");
//+ means concatenate - or combine - strings
System.out.print("["+gameBoard[1]+"] ");
System.out.print("["+gameBoard[2]+"] ");
System.out.print("["+gameBoard[3]+"] ");
System.out.print("["+gameBoard[4]+"] ");
System.out.print("["+gameBoard[5]+"] ");
System.out.print("["+gameBoard[6]+"] ");
System.out.println();
}
public static int userChoice(int[] gameBoard)
{
	int choice =-1;
	int counter=gameBoard[choice];
	while(choice <1 || choice >6)
	{
  System.out.println("Please select pod 1 -6");
  Scanner myInput = new Scanner(System.in);
  //what user types in is assigned to user
  choice  =myInput.nextInt();
	}
  counter=gameBoard[choice];
  // increment bins;
int moves=0;
while (gameBoard[choice]>0)
{
moves=moves+1;
gameBoard[(choice+moves)%14]=
gameBoard[(choice+moves)%14] + 1;
//the current index + 1
//subtract 1 from user hand as each stone is added to next pod
gameBoard[choice]=gameBoard [choice]-1;
}//while
  return choice;
}//userChoice
//DEFINING the method
public static int AIChoice(int[] gameBoard)
{
Random rn = new Random();
int counter= rn.nextInt(6) + 8;
System.out.println("I selected bucket #"+counter);  
  // increment bins;
int moves=0;
while (gameBoard[counter]>0)
{
moves=moves+1;
gameBoard[(counter+moves)%14]=
gameBoard[(counter+moves)%14] + 1;
//the current index + 1
//subtract 1 from user hand as each stone is added to next pod
gameBoard[counter]=gameBoard[counter]-1;
}//while
  return counter;
}//AIChoice
  public static void main(String[] args) {
    //create an array called mancalaBoard with 12 elements each can store an integer
int[] mancalaBoard = new int[14];
    System.out.println("Welcome to Mancala!");
  Scanner myInput = new Scanner(System.in);
  int numberOfPlayers=0;
  //what user types in is assigned to user
  while(!(numberOfPlayers==1 || numberOfPlayers==2))
{
System.out.println("Would you like to play with 1 or 2 players?");
  numberOfPlayers=myInput.nextInt();
};
//initialize mancalaBoard
/*
set counter variable to 0; it increases by 1 each time through for loop; is 1 lt than 12; repeat loop; is 12 lt 12 break out of loop
*/
for (int counter=1;counter<14;counter++)
{
mancalaBoard[counter]=4;// short cut to set each circle on the board to equal to 4 stones
  };//for
mancalaBoard[7]=mancalaBoard[0]=0; //7-user 0-Ai
  //diplay the displayMancalaBoard
int stonesOnBoard=48;
while(stonesOnBoard>0)
{
drawBoardForUser(mancalaBoard);
//USING the method
userChoice(mancalaBoard);
//
//AIChoice(mancalaBoard);
if (numberOfPlayers==2)
AIChoice(mancalaBoard);
//update
stonesOnBoard=48-mancalaBoard[0]-mancalaBoard[7];
};//while
if (mancalaBoard[0]<mancalaBoard[7])
System.out.println("You won!  You: "+mancalaBoard[7]+" AI: "+mancalaBoard[0]);
else if (mancalaBoard[7]<mancalaBoard[0])
System.out.println("The AI won!  You: "+mancalaBoard[7]+" AI: "+mancalaBoard[0]);
else if (mancalaBoard[7]==mancalaBoard[0])
System.out.println("It was a tie!  You: "+mancalaBoard[7]+" AI: "+mancalaBoard[0]);
  };//main
}//mancalaBoard