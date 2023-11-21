package com.mnc.transactions;

//Declaring bst 
	class Node{
		public Node(int i) {
			// TODO Auto-generated constructor stub
		}
		int key;
		Node leftnode,rightnode;
		public Node left;
		public Node right;
	}
public class Main {
	
	
	//creating the new node
	
	//inserting node
	static Node insert(Node root,int key) {
		Node newNode=newNode(key);
		Node data=root;
		Node point=null;//point has pointer of data
		while(data!=null) {
			point=data;
			if(key<data.key)
				data=data.leftnode;
			else if(key>data.key)
				data=data.rightnode;
			else {
				System.out.println("values already exist");
				return newNode;}
		}
		if(point==null)
			point=newNode;
		//if key is less than new node assign to left child
		else if(key<point.key)
			point.leftnode=newNode;
		//if key is greater than new node assign to right child
		else
			point.rightnode=newNode;
		//return point to new node
	return point;	
	}
	static void inOrder(Node root) {
		if (root==null)
			return;
		else {
			inOrder(root.leftnode);
			System.out.println(root.key+"");
			inOrder(root.rightnode);
		}
	}

	private Node node;
	
	public static void main(String[] args) {
		int value,number;

	     Main tree = new Main();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left= new Node(55);


	}

}
