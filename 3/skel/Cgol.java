import java.io.*;
import java.util.*;


/**
   The Rules of Life:
   Survivals:
   * A cell with 2 or 3 living neighbours will survive for the next generation.
   Death:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Birth:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation
*/
//group of 3 or 4 will live, anything more or less will die.
public class Cgol
{

  //initialize empty board (all cells dead)
  public static char[][] createNewBoard(int rows, int cols) {
      char[][] board = new char [rows][cols];
      for (int row = 0; row < board.length; row++) {
        for (int col = 0; col < board[0].length; col ++) {
          setCell(board,row,col,'.');
        }
    }
      return board;
  }


  //print the board to the terminal
  public static void printBoard(char[][] board) {
    System.out.println("Updated Board:");
    for (int row = 0; row < board.length; row++) {
	    for (int col = 0; col < board[0].length; col ++) {
		    System.out.print(board[row][col] + " ");
      }
      System.out.println("");
    }
  }


  //set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val){
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours(char[][] board, int r, int c) {
    int livingNeighbors = 0;
    //TODO: fix edge cases
    if(board[r-1][c-1] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    if(board[r-1][c] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    if(board[r-1][c+1] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    if(board[r][c-1] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    if(board[r][c+1] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    if(board[r+1][c-1] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    if(board[r+1][c] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    if(board[r+1][c+1] == 'L'){
      livingNeighbors = livingNeighbors + 1;
    }
    System.out.println("["+r+"]" +"["+c+"]" + "=" + livingNeighbors);
    return livingNeighbors;
  }
    /**
    int count=0;
    for (row=r-1;row<= r+1; row++){
      for(col=c -1;col<=c+1;col++){
        if (row>=0 && row <r && col>= 0 && col<c)
      }
    }
    **/
   


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'L', dead '.')
  */
  public static char getNextGenCell(char[][] board,int r, int c) {
    int numNeighbours = countNeighbours(board, r, c);
    
    if(isAlive(board,r,c)){
      
      if(numNeighbours == 3 || numNeighbours == 2){ 
        return 'L'; //survival
      }else{
        return '.'; //death
      }

    }else{ //if cell starts out dead
      if(numNeighbours == 3){ //enough neighbors to birth
        return 'L';
      }else{
        return '.';
      }
    }
  }

//tells us if the cell is alive
  public static boolean isAlive(char[][] board,int r, int c){
    if(board[r][c] == 'L'){
      return true;
    }else{
      return false;
    }
  }

  // //generate new board representing next generation
 // // public static char[][] generateNextBoard(char[][] board) {

  // }


  public static void main( String[] args )
  {
    //board before the positions are in play
    System.out.println("dead board");
    char[][] board;
    board = createNewBoard(7,7);
    //printBoard(board);
    
    
    //breathe life into some cells:
    setCell(board, 0, 0, 'L');
    setCell(board, 0, 1, 'L');
    setCell(board, 1, 0, 'L');
    setCell(board, 2, 2, 'L');
    setCell(board, 4, 4, 'L');
    setCell(board, 3, 3, 'L');

    System.out.println("The number of neighbors of row: " + 3 + " and col: " + 3);
    System.out.println(countNeighbours(board, 3, 3));
    System.out.println("Next gen cell for 3,3: " + getNextGenCell(board,3,3));
  
  /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    for (int row = 0; row < board.length; row++) {
        for (int col = 0; col < board[0].length; col ++) {
          System.out.print("The number of neighbors of row: " + row + "and col: " + col);
          System.out.println(countNeighbours(board, row, col));
        }
    }
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    printBoard(board);

    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)
    System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class