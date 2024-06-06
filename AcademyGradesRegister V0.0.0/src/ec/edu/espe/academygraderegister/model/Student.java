/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygraderegister.model;


/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class Student {
    private int id;
    private StudentName studentname;
    
    public Student(int id, StudentName studentname){
    this.id = id;
   /** this.StudentName = studentname;*/
    }
    public int getId() {
        return id;
    }
    public String getStudentName() {
        return studentname.toString();
    }      
     public void setStudentName(StudentName studentname) {
        this.studentname = studentname;
    }

    public void setId(int id) {
        this.id = id;
    }
}