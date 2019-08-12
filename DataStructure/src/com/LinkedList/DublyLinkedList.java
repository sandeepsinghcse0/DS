package com.LinkedList;

public class DublyLinkedList {
    class Node{
    	Node next;
    	Node prev;
    	School school;
    	public Node(School school) {
    		this.school = school;
    	}
    }
    
    Node head, tail;
    
    public DublyLinkedList() {
    	head = tail = null;
    }
    
    
    public void insertAtHead(School school) {
    	Node temp = new Node(school);
    	if(head == null) {
    		head = tail = temp;
    	}else {
    		temp.next = head;
    		head.prev = temp;
    		head = temp;
    	}
    }
    
    public void insertAtTail(School school) {
    	Node temp = new Node(school);
    	if(tail == null) {
    		head = tail = temp;
    	}else {
    		tail.next = temp;
    		temp.prev = tail;
    		tail = temp;
    	}
    }
    
    public void traverse() {
    	Node temp = head;
    	while(temp!=null) {
    		String name = temp.school.name;
    		System.out.print(name+"    ---->    ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
    
    public void printReverse() {
    	Node temp = tail;
    	while(temp!=null) {
    		String name = temp.school.name;
    		System.out.print(name+ "    ---->    ");
    		temp = temp.prev;
    	}
    	System.out.println();
    }
    
    public static void main(String args[]) {
      DublyLinkedList dList = new DublyLinkedList();
  	  dList.insertAtHead(new School("Saraswati", 1, 10));
  	  dList.insertAtHead(new School("Children Higer secondry School", 2, 10));
   	  dList.insertAtHead(new School("Resonance", 3, 10));
   	  dList.traverse();
   	  dList.printReverse();
	  dList.insertAtTail(new School("Children Higer secondry School", 2, 10));
	  dList.traverse();
    }
}
