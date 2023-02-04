package com.mycompany.csc229_assignment01;
// @author MoaathAlrajab

/**
 *
 * @author nyarachoudhury
 */

public class Course {
    private String Name; //declaration of the necessary variables 
    private String Code; 
    private int ID;
    
    /**
     *
     */
    public Course () { //default constructor 
}

    /**
     *
     * @param Name
     */
    public void setName(String Name) { //setter for Name
    this.Name = Name;
}

    /**
     *
     * @return
     */
    public String getName() { //getter for Name
    return Name;
}

    /**
     *
     * @param Code
     */
    public void setCode(String Code) { //setter for Code
    this.Code = Code;
}

    /**
     *
     * @return
     */
    public String getCode() { //getter for Code 
    return Code;
}

    /**
     *
     * @param ID
     */
    public void setID(int ID) { //setter for ID 
    this.ID = ID; 
}

    /**
     *
     * @return
     */
    public int getID() { //getter for ID 
    return ID; 
}

    /**
     *
     * @param Name
     * @param Code
     * @param ID
     */
    public Course (String Name, String Code, int ID) { //overload constructor that updates the variables
    this.Name = Name;
    this.Code = Code; 
    this.ID = ID;
  } 
}