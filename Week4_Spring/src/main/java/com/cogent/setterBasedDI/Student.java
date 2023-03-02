package com.cogent.setterBasedDI;
public class Student {  
private String name;     //It gets Initialized By Setter
  
public String getName() {  
    return name;  
}  
  
public void setName(String name) {   //Setter Method
    this.name = name;  
}  
  
public void displayInfo(){  
    System.out.println("Hello: "+name);  
}  
}  
