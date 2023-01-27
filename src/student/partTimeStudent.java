/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kiruj
 */
// partTimeStudent is the child class
// student class is the parent class, inheritance
public class partTimeStudent extends Student { 
    
    private int numOfcourse;

    public partTimeStudent(int numOfcourse, String studentId, String studentName) {
        super (studentId, studentName);
        this.numOfcourse = numOfcourse;
    }

    public int getNumOfcourse() {
        return numOfcourse;
    }

    public void setNumOfcourse(int numOfcourse) {
        this.numOfcourse = numOfcourse;
    }
    
}
