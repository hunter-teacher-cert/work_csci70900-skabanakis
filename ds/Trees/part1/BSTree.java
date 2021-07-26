import java.io.*;
import java.util.*;

public class BSTree {
    private TreeNode root;

    public BSTree(){
	root = null;
    }
	//collabe with jiyoon and ian on delete
	public void delete(int key){

	// if the tree is empty, nothing to delete
	if (root==null){
	    return;
	}//end of if
	

	// find the node that we want to delete
	// and the node above it using piggybacking
	TreeNode front = root;
	TreeNode trailer = root;

	// do the piggyback loop
	// until we either find the node or null
	// if the key isn't present
	while (front != null && front.getData() != key ){
	    if (front.getData() < key){
		trailer = front;
		front = front.getRight();
	    } else {
		trailer = front;
		front = front.getLeft();
	    }//end of if
	}//end of while

	// if the key wasn't in the tree
	if (front == null){
	    return;
	}

	// if we get here
	// front points to the node we want to delete
	// and trailer points to the one above it

	// case 1 -- the node we want to delete is a leaf
	//this conditional is making sure it has no children then it is declared as a leaf
	if (front.getLeft() == null &&
	    front.getRight() == null) {
			if(front.getData() < trailer.getData()) {
				trailer.setLeft(null);
			} else{
				trailer.setRight(null);
			}
		
		
		//case 2: if they have one child 
	} else if (front.getLeft()== null || front.getRight()== null){
	    
		if(front.getData()< trailer.getData()){
			if(front.getRight()==null){
				trailer.setLeft(front.getLeft());
				
			}else{
				trailer.setLeft(front.getRight());
			}
		}else{
			if(front.getRight()==null){
				trailer.setRight(front.getLeft());
				
			}else{
				trailer.setRight(front.getRight());
			}
		}
		//case 3: has 2 children
	} else{ //2 children
        //if (root.getData() == key){ //check to see if you're deleting the root to repoint
        //}
          TreeNode max = findMax(front.getLeft());
          //replace front with it
          this.delete(max.getData());
          front.setData(max.getData());//premax's child's data!
      }
    }
    private TreeNode findMax(TreeNode start){
      if (start.getRight()==null){ //base case
        return start;
      }
      return findMax(start.getRight());
    }

	

	
	
    //processing in the beginning of the tree
	private void preorderTraverse(TreeNode current){
	if (current == null)
	    return;

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the left subtree
	preorderTraverse(current.getLeft());

	// recursively print out the right subtree
	preorderTraverse(current.getRight());
    }// end of preorderTraverse with node

    public void preorderTraverse(){
	preorderTraverse(root);
	System.out.println();
    } //end of preorderTraverse without node

    //processing at the very end of the tree
	private void postorderTraverse(TreeNode current){
	if (current == null)
	    return;

	// recursively print out the left subtree
	postorderTraverse(current.getLeft());

	// recursively print out the right subtree
	postorderTraverse(current.getRight());

	//process the current node
	System.out.print(current.getData()+", ");



    }// end of postorderTraverse with node

    public void postorderTraverse(){
	postorderTraverse(root);
	System.out.println();
    } //end of postorderTraverse without node
//working in the middle  it gives us a sorted list
    private void inorderTraverse(TreeNode current){
	if (current == null)
	    return;


	// recursively print out the left subtree
	inorderTraverse(current.getLeft());

	//process the current node
	System.out.print(current.getData()+", ");

	// recursively print out the right subtree
	inorderTraverse(current.getRight());
    }// end of inorderTraverse with nodes

    public void inorderTraverse(){
	inorderTraverse(root);
	System.out.println();
    } //end of 	inorderTraverse without parameters
	
	public int search(int key){
	TreeNode current =root;
		while( current != null){
		int currentValue = current.getData();
		if(currentValue == key){
			//if we found a match we want to return the match
			return currentValue;
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
		throw new NullPointerException();
	}//end of search

 public void insert(int key){

	TreeNode newNode = new TreeNode(key);

	// if the tree is empty
	// manually insert the new node as the root
	if (root==null){
	    root = newNode;
	    return;
	}
	
	TreeNode front = root;
	//have to initalize the node otherwise the program will not work
	TreeNode trailer = root;
	
	while (front != null){
	    int frontValue = front.getData();
	    if (frontValue == key){
		// if we're here, it means the key is
		// already in the tree so we can
		// update this node in some way
		// and then return
		return;
	    } else if (frontValue < key){
		trailer = front;
		front = front.getRight();
	    } else {
		trailer = front;
		front = front.getLeft();
	    }
	}
	if (key > trailer.getData()){
	    // insert on the right
		//greater than the original node
	    trailer.setRight(newNode);
	} else {
	    // insert on left
		//because its less then the value in the node
	    trailer.setLeft(newNode);

	}//end of if statements

    }//end of insert


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