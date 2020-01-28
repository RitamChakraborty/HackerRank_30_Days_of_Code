// https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

package day_24_more_linked_lists;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
	
}

class Solution {
	public static Node removeDuplicates(Node head) {
		Node node = head;
		
		while (node != null) {
			int data = node.data;
			Node temp = node;
			
			while (temp.next != null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next;
				} else {
					temp = temp.next;
				}
			}
			
			node = node.next;
		}
		
		return head;
	}
	
	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;
			
		}
		return head;
	}
	
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
	}
}