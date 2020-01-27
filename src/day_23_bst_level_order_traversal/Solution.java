package day_23_bst_level_order_traversal;

import java.util.*;

class Node{
	Node left,right;
	int data;
	Node(int data){
		this.data=data;
		left=right=null;
	}
}

class Solution{
	private static Set<Integer> set = new HashSet<>();
	private static Queue<Node> queue = new ArrayDeque<>();
	
	static void levelOrder(Node node){
		if (node != null) {
			if (!set.contains(node.data)) {
				queue.add(node);
				set.add(node.data);
			}
			
			if (node.left != null) {
				if (!set.contains(node.left.data)) {
					queue.add(node.left);
					set.add(node.left.data);
				}
			} if (node.right != null) {
				if (!set.contains(node.right.data)) {
					queue.add(node.right);
					set.add(node.right.data);
				}
			}
			
			System.out.print(queue.poll().data + " ");
			levelOrder(queue.peek());
		}
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
		levelOrder(root);
	}
}