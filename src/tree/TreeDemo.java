package tree;

public class TreeDemo {

	public static void main(String[] args) {
			Tree t = new Tree();
			t.addNode(10);
			t.addNode(20);
			
			
			System.out.println(t.root.data);
			System.out.println(t.root.left.data);
			
			//binary tree 
			//BST - binary search tree  
	}
}

class Tree{
	Node root;
	
	
	void addNode(int data){
		if(root == null) {
			root = new Node();
			root.data = data; 
		}else {
			Node tmp = new Node();
			tmp.data = data;
			root.left = tmp;
		}
	}
}
class Node{
	int data;
	Node left;
	Node right; 
}


//tree ->non linear data structure 
// data --> node 
//

/*
 * 
 * 			ds: binary tree { min:0 , max:2 } 	
 * 			
 * 			parent node 
 * 			child node 
 * 			root node 
 * 			leaf node 
 * 			sibling 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
