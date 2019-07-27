package com.LinkedList;

//import java.util.*;

class LinkedList{
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	
	private Node head;
	
	public void insert(int value) {
		Node temp = new Node(value);
		temp.next = this.head;
		this.head = temp;
	}
	
	public void addLast(int value) {
		if(this.head == null) {
			head = new Node(value);
		} else {
			Node temp  = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(value);
		}
	}
	
	public Node remove() {
		Node result;
		if(this.head == null) {
			result = null;
		}else {
			Node temp = this.head;
			this.head = this.head.next;
			result =  temp;
		}
		return result;
	}
	
	public void traverse() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.value +"-->");
			temp = temp.next; 
		}
		System.out.print("null\n");
	}
	
	public boolean contains(int val) {
		if(this.head == null) {
			return false;
		} 
		Node temp = this.head;
		while(temp != null) {
			if(temp.value == val) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public static void main(String args[]) {
		int[] arr = {0,1,1,2,3,4,5,6,7};
		LinkedList ls = new LinkedList();
		for(int i=0; i<arr.length; i++) {
			ls.insert(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			ls.addLast(arr[i]);
		}
		
		ls.traverse();
		System.out.println(ls.contains(7));
	}
}
