package com.edu;

public class Student {
 private  int id;
 private String name;
 
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public void display() {
	 System.out.println("id of Student :"+id);
	 System.out.println("name of student :" +name);
 }
}
