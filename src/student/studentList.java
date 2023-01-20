/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author kiruj
 */
public class studentList {
      public static void main(String[] args){
        
        Student s1 = new Student("s1", "jegak");
        Student[] StudentList = new Student[3];
        StudentList[0] = new Student("s1", "jegak");
        StudentList[1] = new Student("s2", "abc");
        StudentList[2] = new Student("s3", "xyz");
       
        for(int i = 0; i <StudentList.length; i++){
            System.out.println(StudentList[i].getStudentName());
            
        } //end of for loop
        
        
    } //end of main
    
}// end of class

