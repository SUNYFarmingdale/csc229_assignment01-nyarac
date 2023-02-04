package com.mycompany.csc229_assignment01;
// @author MoaathAlrajab

public class Course {
    private String Name; //declaration of the necessary variables 
    private String Code; 
    private int ID;
    
public Course () { //default constructor 
}

public void setName(String Name) { //setter for Name
    this.Name = Name;
}

public String getName() { //getter for Name
    return Name;
}

public void setCode(String Code) { //setter for Code
    this.Code = Code;
}

public String getCode() { //getter for Code 
    return Code;
}

public void setID(int ID) { //setter for ID 
    this.ID = ID; 
}

public int getID() { //getter for ID 
    return ID; 
}

public Course (String Name, String Code, int ID) { //overload constructor that updates the variables
    this.Name = Name;
    this.Code = Code; 
    this.ID = ID;
  } 
}