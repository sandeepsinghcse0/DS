package com.LinkedList;

public class SchoolNode {
    private School school;
    private SchoolNode next;
    
    public SchoolNode(School school) {
    	this.school = school;
    	this.next = null;
    }
    
    public School getSchool() {
    	return this.school;
    }
    
    public SchoolNode getNext() {
    	return next;
    }
    
    public void setSchool(School school) {
    	this.school = school;
    }
    
    public void setNext(SchoolNode node) {
    	this.next = node;
    	
    }
}
