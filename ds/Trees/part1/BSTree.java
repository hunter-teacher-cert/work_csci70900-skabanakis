import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }
	public int search(int key){
	TreeNode current =root;
		while( current != null){
		int currentValue = current.getValue();
		if(currentValue == key){
			//if we found a match we want to return the match
			return key;
		}	//end of if
		else if(currentValue < key){
			//if the key is higher than the root, then we are moving to the right
			//the right side of the tree holds the greater value 
			//left side hold the lower value
			current = current.getRight();
		}//end else if
		else{
			//becuase then if the key is less than the root than we go to the left side
			current = current.getLeft();
			
		}//end else
		} //end of while
		return -1;
	}//end of search

    public void seed(){
	TreeNode t;

	t = new TreeNode(10);
	root = t;
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);

	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);
	
	}
    
    
}