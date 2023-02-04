
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */   
 public class NewClass {
     public static void main(String[] args) {
        Course course = new Course ("English", "EGL102", 1234); 
        course.setName("Psychology");
        course.setCode("PSY101");
        course.setID(4321);  
      System.out.println("Name: " + course.getName() + " Code: " + course.getCode() + "ID: " + course.getID());
    }  
}
