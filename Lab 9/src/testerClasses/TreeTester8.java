package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedBinaryTree2;
import treeInterfaces.Position;

public class TreeTester8 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		
		Position<Integer> p1 = t.addRoot(4);
		t.addLeft(p1, 3);
		t.addRight(p1, 7);
		
		
//		t.insert(4); 
//		t.insert(9); 
//		t.insert(7); 
//		t.insert(10); 
//		t.insert(20); 
//		t.insert(15); 
//		t.insert(12);
//		t.insert(17); 
//		t.insert(19); 
//		t.insert(21); 
//		t.insert(40); 
//		t.insert(30); 
//		t.insert(45); 
		
		LinkedBinaryTree<Integer> t2 = new LinkedBinaryTree<>();
		LinkedBinaryTree<Integer> t3 = new LinkedBinaryTree<>();
		
		t2= t.clone();

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		
	}

}
