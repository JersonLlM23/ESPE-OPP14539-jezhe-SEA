<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.model;

/**
 *
 * @author Ricardo Lainez JEZHE Software Sssosiation Engineers - DCCO ESPE
 */
import com.google.gson.annotations.Expose;

public class Grade {
    @Expose
    private String studentId;
    @Expose
    private String subjectCode;
    @Expose
    private double grade;

    public Grade(String studentId, String subjectCode, double grade) {
        this.studentId = studentId;
        this.subjectCode = subjectCode;
        this.grade = grade;
    }

    // Getters and setters

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" + "studentId=" + studentId + ", subjectCode=" + subjectCode + ", grade=" + grade + '}';
    }
    
    
    
}

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.model;

/**
 *
 * @author JEZHE Software Sssosiation Engineers - DCCO ESPE
 */
import com.google.gson.annotations.Expose;

public class Grade {
    @Expose
    private String studentId;
    @Expose
    private String subjectCode;
    @Expose
    private double grade;

    public Grade(String studentId, String subjectCode, double grade) {
        this.studentId = studentId;
        this.subjectCode = subjectCode;
        this.grade = grade;
    }

    // Getters and setters

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" + "studentId=" + studentId + ", subjectCode=" + subjectCode + ", grade=" + grade + '}';
    }
    
    
    
}

>>>>>>> 3c4bd1f38f36c8722408e2412688941930e19604
