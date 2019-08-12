package com.LinkedList;

public class SchoolLinkedList {
      private SchoolNode head = null;
      private int size=0;
      
      public void addFront(School school) {
    	 SchoolNode node = new SchoolNode(school);
    	 node.setNext(head);
    	 this.head = node;
    	 size++;
      }
      
      public void printSchoolList() {
    	  SchoolNode temp = head;
    	  while(temp!=null) {
    		  System.out.print(temp.getSchool().name +"----->");
    		  temp = temp.getNext();
    	  }
      }
      
      public int getSize() {
    	  return this.size;
      }
      
      public static void main(String args[]) {
    	  SchoolLinkedList sList = new SchoolLinkedList();
    	  sList.addFront(new School("Saraswati", 1, 10));
    	  sList.addFront(new School("Children Higer secondry School", 2, 10));
     	  sList.addFront(new School("Resonance", 3, 10));
     	  sList.printSchoolList();
      }
}
