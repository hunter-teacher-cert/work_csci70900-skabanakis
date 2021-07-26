import java.io.*;
import java.util.*;


public class Driver {
	public static void main(String[] args) {
		BSTree t = new BSTree();

		/*t.seed();
		
		int value;
		value = t.search(10);
		System.out.println(value);
		value = t.search(15);
		System.out.println(value);
		try {
			value = t.search(17);
			System.out.println(value);
		} catch (NullPointerException e) {
			System.out.println("17 not in tree");
		}*/
		t.insert(10);
		t.insert(20);
		t.insert(5);
		t.insert(7);
		t.insert(8);
		t.insert(3);
		t.insert(25);
		t.insert(23);
		t.insert(2);
		t.insert(4);
		
	

		System.out.println("Pre-Order Traverse:");
		t.preorderTraverse();
		System.out.println("Post-Order Traverse:");
		t.postorderTraverse();
		System.out.println("In-Order Traverse:");
		t.inorderTraverse();
		
		
		System.out.println("Test case 3, with 2 child");
		t.delete(5);
		t.inorderTraverse();
		t.delete(20);
		t.inorderTraverse();
		t.delete(4);
		t.inorderTraverse();
		/*
		System.out.println("Test case 2, with 1 child");
		t.delete(20);
		t.inorderTraverse();
		t.delete(7);
		t.inorderTraverse();*/
		
	}
}