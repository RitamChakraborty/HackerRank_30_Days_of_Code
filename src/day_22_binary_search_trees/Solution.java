// https://www.hackerrank.com/challenges/30-binary-search-trees/problem

package day_22_binary_search_trees;

import java.util.Scanner;

class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

class Solution{
	
	private static int height = 0;
	
	private static void getHeight(Node node, int h) {
		
		if (node == null) {
			height = Integer.max(height, h);
		} else {
			getHeight(node.left, h + 1);
			getHeight(node.right, h + 1);
		}
	}
	
	public static int getHeight(Node root){
		getHeight(root, 0);
		return height - 1;
	}
	
	public static Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		else{
			Node cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		int height=getHeight(root);
		System.out.println(height);
	}
}